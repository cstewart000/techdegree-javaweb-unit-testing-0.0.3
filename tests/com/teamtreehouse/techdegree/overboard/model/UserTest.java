package com.teamtreehouse.techdegree.overboard.model;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by helloworld on 24/07/2016.
 */
public class UserTest {

    //Done: core - Create a new Test Fixture for the User model in a separate but same package test directory structure.

    //TODO: core - Write a test to assert that the answerer’s reputation goes up by 10 points if their answer is upvoted.
    //TODO: core - Write a test that that proves that having an answer accepted gives the answerer a 15 point reputation boost
    //TODO: core - Using a test, ensure that voting either up or down is not allowed on questions or answers by the original author, you know to avoid gaming the system. Ensure the proper exceptions are being thrown.
    //TODO: core - Write a test to make sure that only the original questioner can accept an answer. Ensure the intended messaging is being sent to back to the caller.


    //TODO: extra - Create additional objects which can be shared across tests.
    //TODO: extra - Reviewing the User.getReputation method may expose some code that is not requested to be tested in the Meets Project instructions. Write the missing test.


    @Before
    public void setUp() throws Exception {

        Board board = new Board("Interesting Topic");
        User originator = new User(board, "Michael");
        User questionner = new User(board, "Susan");
        User answerer = new User(board, "bob");


        Post post = new Post(originator, "an opinion");

        Question question = new Question(questionner, "aquestion");

        Answer answer = new Answer(question, answerer, "an answer");

    }

    @After
    public void tearDown() throws Exception {

    }
}