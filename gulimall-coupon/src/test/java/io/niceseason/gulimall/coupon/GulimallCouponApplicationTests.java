package io.niceseason.gulimall.coupon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import io.niceseason.gulimall.coupon.entity.CouponEntity;
import io.niceseason.gulimall.coupon.service.CouponService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@Testcontainers
@ContextConfiguration(initializers = GulimallCouponApplicationTests.Initializer.class)
class GulimallCouponApplicationTests {

	@Container
	private static MySQLContainer database = (MySQLContainer) new MySQLContainer("mysql:5.6")
			.withInitScript("sql/init.sql");
	@Autowired
	private CouponService couponService;

	static class Initializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
		@Override
		public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
			TestPropertyValues
					.of("spring.datasource.url=" + database.getJdbcUrl(),
							"spring.datasource.username=" + database.getUsername(),
							"spring.datasource.password=" + database.getPassword())
					.applyTo(configurableApplicationContext.getEnvironment());
		}
	}

	@Test
	void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("测试优惠券");
        couponService.save(couponEntity);
        System.out.println("保存成功");
		couponEntity = new CouponEntity();
		couponEntity.setCouponName("测试修改版2");
		couponEntity.setId(2L);
		log.info("xxxxxxxx couponService: {}", couponService);
		couponService.updateById(couponEntity);
		assert (couponService.count() > 0);
	}

	@Test
	void testTime() {
		LocalDate now = LocalDate.now();
		LocalTime min = LocalTime.MIN;
		LocalDateTime localDateTime = now.atTime(min);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String format = localDateTime.format(dateTimeFormatter);
		System.out.println(format);

		LocalDate end = now.plusDays(2);
		LocalDateTime endTime = end.atTime(LocalTime.MAX);
		System.out.println(endTime);
	}
}
