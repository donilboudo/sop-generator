/*
 *  Copyright 2013-2016, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.
    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 
    You may obtain a copy of the License at 
        http://www.apache.org/licenses/LICENSE-2.0 
    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.
 */
package com.interfacing.sopgenerator.helpers;


import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.toc.TocGenerator;

import java.io.File;

public class TocAdd {
	

	
	static String inputfilepath = "sop-template2.docx";
	static String outputfilepath = "OUT_TocAdd.docx";
	
    public static final String TOC_STYLE_MASK = "TOC%s";
    
    public static void main(String[] args) throws Exception{
    	
        WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new File(inputfilepath));

        
        TocGenerator tocGenerator = new TocGenerator(wordMLPackage);
    	// to generate page numbers, you should install your own local instance of Plutext PDF Converter, 
    	// and point to that in docx4j.properties
        
        //tocGenerator.generateToc( 0,    "TOC \\h \\z \\t \"comh1,1,comh2,2,comh3,3,comh4,4\" ", true);
        
        tocGenerator.generateToc( 0,    "TOC \\o \"1-3\" \\h \\z \\u ", true);
        
        wordMLPackage.save(new File(outputfilepath) );
        
        

    }


}