package com.infraera.base.cucumber.stepdefs;

import com.infraera.base.InfraeraApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = InfraeraApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
