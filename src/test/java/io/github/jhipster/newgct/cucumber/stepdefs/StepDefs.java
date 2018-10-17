package io.github.jhipster.newgct.cucumber.stepdefs;

import io.github.jhipster.newgct.NewgctApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = NewgctApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
