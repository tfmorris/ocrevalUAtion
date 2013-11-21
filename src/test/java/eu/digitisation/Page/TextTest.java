/*
 * Copyright (C) 2013 IMPACT Centre of Competence
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package eu.digitisation.Page;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carrasco@ua.es
 */
public class TextTest {
    
    public TextTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getText method, of class Text.
     */
    @Test
    public void testGetText() throws FileNotFoundException {
        System.out.println("getText");
        File ifile  = new File("target/test-classes/00445310.xml");
        File ofile = new File("target/test-classes/00445310.txt");
        TextContent instance = new TextContent(ifile);
 //       String expResult = "";
        PrintWriter writer = new PrintWriter(ofile);
        String result = instance.toString();
        writer.write(result);
        writer.close();
//        assertEquals(expResult, result);
       
    }
}