/**
 * 
 */
package com.mindtree.springfive.webxml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author M1044357
 *
 */
@EnableWebMvc
@ComponentScan(basePackages="com.mindtree.springfive")
@Configuration
public class SpringWebInitializer {

}
