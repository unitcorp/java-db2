/*
 * Copyright © 2018 IBM Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package com.ibm.db2.spring.framework;

import org.springframework.beans.factory.annotation.Value;

public class Db2ConfigurationProperties {

	@Value("${db2.serverName}")
	private String serverName;
	
	@Value("${db2.portNumber}")
	private String portNumber;
	
	@Value("${db2.user}")
    private String user;

	@Value("${db2.password}")
    private String password;

	@Value("${db2.databaseName}")
    private String databaseName;
    

	/** Db2 Jcc Global Property File to specify Db2 Jcc driver properties*/
	@Value("${db2.globalPropertyFile}")
    private String globalPropertyFile;
	
	
	public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerName() {
        return this.serverName;
    }
    
    
    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public String getPortNumber() {
        return this.portNumber;
    }

    
    public void setUser(String user) {
        this.user = user;
    }
    
    public String getUser() {
        return this.user;
    }
    
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }


	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

		
	public String getGlobalPropertyFile() {
		return globalPropertyFile;
		
	}

	public void setGlobalPropertyFile(String globalPropertyFile) {
    	if(globalPropertyFile != null && !globalPropertyFile.trim().isEmpty()){
    		System.setProperty ("db2.jcc.propertiesFile", globalPropertyFile);
		}
		this.globalPropertyFile = globalPropertyFile;
	}
    
}
