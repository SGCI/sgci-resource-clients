package org.sgci.resource.models;
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class ConnectionDefinition {
    public enum ConnectionProtocol {
        SSH, GLOBUS, HTTP, SFTP, SCP, IRODS
    }

    public enum SecurityProtocol {
        PASSWORDS, SSHKEYS, X509, OAUTH2
    }

    private ConnectionProtocol connectionProtocol;
    private SecurityProtocol securityProtocol;
    private Integer port;
    private boolean useProxy;
    private String proxyHost;
    private Integer proxyPort;

    public ConnectionProtocol getConnectionProtocol() {
        return connectionProtocol;
    }

    public ConnectionDefinition setConnectionProtocol(ConnectionProtocol connectionProtocol) {
        this.connectionProtocol = connectionProtocol;
        return this;
    }

    public SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    public ConnectionDefinition setSecurityProtocol(SecurityProtocol securityProtocol) {
        this.securityProtocol = securityProtocol;
        return this;
    }

    public Integer getPort() {
        return port;
    }

    public ConnectionDefinition setPort(Integer port) {
        this.port = port;
        return this;
    }

    public boolean isUseProxy() {
        return useProxy;
    }

    public ConnectionDefinition setUseProxy(boolean useProxy) {
        this.useProxy = useProxy;
        return this;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public ConnectionDefinition setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
        return this;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public ConnectionDefinition setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
        return this;
    }
}
