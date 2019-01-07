package com.zw.myspringboot.utils.redis;

import java.util.Arrays;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(
        prefix = "redisson"
)
public class RedissonProperties {
    private String codec;
    private int timeout = 3000;
    private String address;
    private String password;
    private int connectionPoolSize = 64;
    private int connectionMinimumIdleSize = 10;
    private int slaveConnectionPoolSize = 10;
    private int masterConnectionPoolSize = 10;
    private String[] sentinelAddresses;
    private String masterName;
    private int idleConnectionTimeout = 10000;
    private int pingTimeout = 1000;
    private int connectTimeout = 10000;
    private int retryAttempts = 3;
    private int retryInterval = 1500;
    private int reconnectionTimeout = 3000;
    private int failedAttempts = 3;
    private int subscriptionsPerConnection = 5;
    private String clientName = null;
    private int subscriptionConnectionMinimumIdleSize = 1;
    private int subscriptionConnectionPoolSize = 50;
    private int database = 0;
    private boolean dnsMonitoring = false;
    private int dnsMonitoringInterval = 5000;

    public RedissonProperties() {
    }

    public String getCodec() {
        return this.codec;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPassword() {
        return this.password;
    }

    public int getConnectionPoolSize() {
        return this.connectionPoolSize;
    }

    public int getConnectionMinimumIdleSize() {
        return this.connectionMinimumIdleSize;
    }

    public int getSlaveConnectionPoolSize() {
        return this.slaveConnectionPoolSize;
    }

    public int getMasterConnectionPoolSize() {
        return this.masterConnectionPoolSize;
    }

    public String[] getSentinelAddresses() {
        return this.sentinelAddresses;
    }

    public String getMasterName() {
        return this.masterName;
    }

    public int getIdleConnectionTimeout() {
        return this.idleConnectionTimeout;
    }

    public int getPingTimeout() {
        return this.pingTimeout;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public int getRetryAttempts() {
        return this.retryAttempts;
    }

    public int getRetryInterval() {
        return this.retryInterval;
    }

    public int getReconnectionTimeout() {
        return this.reconnectionTimeout;
    }

    public int getFailedAttempts() {
        return this.failedAttempts;
    }

    public int getSubscriptionsPerConnection() {
        return this.subscriptionsPerConnection;
    }

    public String getClientName() {
        return this.clientName;
    }

    public int getSubscriptionConnectionMinimumIdleSize() {
        return this.subscriptionConnectionMinimumIdleSize;
    }

    public int getSubscriptionConnectionPoolSize() {
        return this.subscriptionConnectionPoolSize;
    }

    public int getDatabase() {
        return this.database;
    }

    public boolean isDnsMonitoring() {
        return this.dnsMonitoring;
    }

    public int getDnsMonitoringInterval() {
        return this.dnsMonitoringInterval;
    }

    public void setCodec(final String codec) {
        this.codec = codec;
    }

    public void setTimeout(final int timeout) {
        this.timeout = timeout;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setConnectionPoolSize(final int connectionPoolSize) {
        this.connectionPoolSize = connectionPoolSize;
    }

    public void setConnectionMinimumIdleSize(final int connectionMinimumIdleSize) {
        this.connectionMinimumIdleSize = connectionMinimumIdleSize;
    }

    public void setSlaveConnectionPoolSize(final int slaveConnectionPoolSize) {
        this.slaveConnectionPoolSize = slaveConnectionPoolSize;
    }

    public void setMasterConnectionPoolSize(final int masterConnectionPoolSize) {
        this.masterConnectionPoolSize = masterConnectionPoolSize;
    }

    public void setSentinelAddresses(final String[] sentinelAddresses) {
        this.sentinelAddresses = sentinelAddresses;
    }

    public void setMasterName(final String masterName) {
        this.masterName = masterName;
    }

    public void setIdleConnectionTimeout(final int idleConnectionTimeout) {
        this.idleConnectionTimeout = idleConnectionTimeout;
    }

    public void setPingTimeout(final int pingTimeout) {
        this.pingTimeout = pingTimeout;
    }

    public void setConnectTimeout(final int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setRetryAttempts(final int retryAttempts) {
        this.retryAttempts = retryAttempts;
    }

    public void setRetryInterval(final int retryInterval) {
        this.retryInterval = retryInterval;
    }

    public void setReconnectionTimeout(final int reconnectionTimeout) {
        this.reconnectionTimeout = reconnectionTimeout;
    }

    public void setFailedAttempts(final int failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

    public void setSubscriptionsPerConnection(final int subscriptionsPerConnection) {
        this.subscriptionsPerConnection = subscriptionsPerConnection;
    }

    public void setClientName(final String clientName) {
        this.clientName = clientName;
    }

    public void setSubscriptionConnectionMinimumIdleSize(final int subscriptionConnectionMinimumIdleSize) {
        this.subscriptionConnectionMinimumIdleSize = subscriptionConnectionMinimumIdleSize;
    }

    public void setSubscriptionConnectionPoolSize(final int subscriptionConnectionPoolSize) {
        this.subscriptionConnectionPoolSize = subscriptionConnectionPoolSize;
    }

    public void setDatabase(final int database) {
        this.database = database;
    }

    public void setDnsMonitoring(final boolean dnsMonitoring) {
        this.dnsMonitoring = dnsMonitoring;
    }

    public void setDnsMonitoringInterval(final int dnsMonitoringInterval) {
        this.dnsMonitoringInterval = dnsMonitoringInterval;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof RedissonProperties)) {
            return false;
        } else {
            RedissonProperties other = (RedissonProperties)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$codec = this.getCodec();
                Object other$codec = other.getCodec();
                if (this$codec == null) {
                    if (other$codec != null) {
                        return false;
                    }
                } else if (!this$codec.equals(other$codec)) {
                    return false;
                }

                if (this.getTimeout() != other.getTimeout()) {
                    return false;
                } else {
                    Object this$address = this.getAddress();
                    Object other$address = other.getAddress();
                    if (this$address == null) {
                        if (other$address != null) {
                            return false;
                        }
                    } else if (!this$address.equals(other$address)) {
                        return false;
                    }

                    Object this$password = this.getPassword();
                    Object other$password = other.getPassword();
                    if (this$password == null) {
                        if (other$password != null) {
                            return false;
                        }
                    } else if (!this$password.equals(other$password)) {
                        return false;
                    }

                    if (this.getConnectionPoolSize() != other.getConnectionPoolSize()) {
                        return false;
                    } else if (this.getConnectionMinimumIdleSize() != other.getConnectionMinimumIdleSize()) {
                        return false;
                    } else if (this.getSlaveConnectionPoolSize() != other.getSlaveConnectionPoolSize()) {
                        return false;
                    } else if (this.getMasterConnectionPoolSize() != other.getMasterConnectionPoolSize()) {
                        return false;
                    } else if (!Arrays.deepEquals(this.getSentinelAddresses(), other.getSentinelAddresses())) {
                        return false;
                    } else {
                        label118: {
                            Object this$masterName = this.getMasterName();
                            Object other$masterName = other.getMasterName();
                            if (this$masterName == null) {
                                if (other$masterName == null) {
                                    break label118;
                                }
                            } else if (this$masterName.equals(other$masterName)) {
                                break label118;
                            }

                            return false;
                        }

                        if (this.getIdleConnectionTimeout() != other.getIdleConnectionTimeout()) {
                            return false;
                        } else if (this.getPingTimeout() != other.getPingTimeout()) {
                            return false;
                        } else if (this.getConnectTimeout() != other.getConnectTimeout()) {
                            return false;
                        } else if (this.getRetryAttempts() != other.getRetryAttempts()) {
                            return false;
                        } else if (this.getRetryInterval() != other.getRetryInterval()) {
                            return false;
                        } else if (this.getReconnectionTimeout() != other.getReconnectionTimeout()) {
                            return false;
                        } else if (this.getFailedAttempts() != other.getFailedAttempts()) {
                            return false;
                        } else if (this.getSubscriptionsPerConnection() != other.getSubscriptionsPerConnection()) {
                            return false;
                        } else {
                            label99: {
                                Object this$clientName = this.getClientName();
                                Object other$clientName = other.getClientName();
                                if (this$clientName == null) {
                                    if (other$clientName == null) {
                                        break label99;
                                    }
                                } else if (this$clientName.equals(other$clientName)) {
                                    break label99;
                                }

                                return false;
                            }

                            if (this.getSubscriptionConnectionMinimumIdleSize() != other.getSubscriptionConnectionMinimumIdleSize()) {
                                return false;
                            } else if (this.getSubscriptionConnectionPoolSize() != other.getSubscriptionConnectionPoolSize()) {
                                return false;
                            } else if (this.getDatabase() != other.getDatabase()) {
                                return false;
                            } else if (this.isDnsMonitoring() != other.isDnsMonitoring()) {
                                return false;
                            } else if (this.getDnsMonitoringInterval() != other.getDnsMonitoringInterval()) {
                                return false;
                            } else {
                                return true;
                            }
                        }
                    }
                }
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RedissonProperties;
    }

    public int hashCode() {
        int result = 1;
        Object $codec = this.getCodec();
        result = result * 59 + ($codec == null ? 43 : $codec.hashCode());
        result = result * 59 + this.getTimeout();
        Object $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        Object $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        result = result * 59 + this.getConnectionPoolSize();
        result = result * 59 + this.getConnectionMinimumIdleSize();
        result = result * 59 + this.getSlaveConnectionPoolSize();
        result = result * 59 + this.getMasterConnectionPoolSize();
        result = result * 59 + Arrays.deepHashCode(this.getSentinelAddresses());
        Object $masterName = this.getMasterName();
        result = result * 59 + ($masterName == null ? 43 : $masterName.hashCode());
        result = result * 59 + this.getIdleConnectionTimeout();
        result = result * 59 + this.getPingTimeout();
        result = result * 59 + this.getConnectTimeout();
        result = result * 59 + this.getRetryAttempts();
        result = result * 59 + this.getRetryInterval();
        result = result * 59 + this.getReconnectionTimeout();
        result = result * 59 + this.getFailedAttempts();
        result = result * 59 + this.getSubscriptionsPerConnection();
        Object $clientName = this.getClientName();
        result = result * 59 + ($clientName == null ? 43 : $clientName.hashCode());
        result = result * 59 + this.getSubscriptionConnectionMinimumIdleSize();
        result = result * 59 + this.getSubscriptionConnectionPoolSize();
        result = result * 59 + this.getDatabase();
        result = result * 59 + (this.isDnsMonitoring() ? 79 : 97);
        result = result * 59 + this.getDnsMonitoringInterval();
        return result;
    }

    public String toString() {
        return "RedissonProperties(codec=" + this.getCodec() + ", timeout=" + this.getTimeout() + ", address=" + this.getAddress() + ", password=" + this.getPassword() + ", connectionPoolSize=" + this.getConnectionPoolSize() + ", connectionMinimumIdleSize=" + this.getConnectionMinimumIdleSize() + ", slaveConnectionPoolSize=" + this.getSlaveConnectionPoolSize() + ", masterConnectionPoolSize=" + this.getMasterConnectionPoolSize() + ", sentinelAddresses=" + Arrays.deepToString(this.getSentinelAddresses()) + ", masterName=" + this.getMasterName() + ", idleConnectionTimeout=" + this.getIdleConnectionTimeout() + ", pingTimeout=" + this.getPingTimeout() + ", connectTimeout=" + this.getConnectTimeout() + ", retryAttempts=" + this.getRetryAttempts() + ", retryInterval=" + this.getRetryInterval() + ", reconnectionTimeout=" + this.getReconnectionTimeout() + ", failedAttempts=" + this.getFailedAttempts() + ", subscriptionsPerConnection=" + this.getSubscriptionsPerConnection() + ", clientName=" + this.getClientName() + ", subscriptionConnectionMinimumIdleSize=" + this.getSubscriptionConnectionMinimumIdleSize() + ", subscriptionConnectionPoolSize=" + this.getSubscriptionConnectionPoolSize() + ", database=" + this.getDatabase() + ", dnsMonitoring=" + this.isDnsMonitoring() + ", dnsMonitoringInterval=" + this.getDnsMonitoringInterval() + ")";
    }
}

