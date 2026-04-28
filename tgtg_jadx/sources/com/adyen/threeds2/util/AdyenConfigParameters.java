package com.adyen.threeds2.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.parameters.ConfigParameters;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AdyenConfigParameters {
    private static final String COLLECTION_DELIMITER = ";";
    public static final Parameter DIRECTORY_SERVER_ID = new Parameter("threeds2.directoryServer", "id");
    public static final Parameter DIRECTORY_SERVER_PUBLIC_KEY = new Parameter("threeds2.directoryServer", "publicKey");
    public static final Parameter DIRECTORY_SERVER_ROOT_CERTIFICATES = new Parameter("threeds2.directoryServer", "rootCertificates");
    public static final Parameter SECURITY_APP_SIGNATURE = new Parameter("security", "appSignature");
    public static final Parameter SECURITY_TRUSTED_APP_STORES = new Parameter("security", "trustedAppStores");
    public static final Parameter SECURITY_MALICIOUS_APPS = new Parameter("security", "maliciousApps");
    public static final Parameter DEVICE_PARAMETER_BLOCK_LIST = new Parameter(null, "deviceParameterBlockList");

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Builder {
        private String mAppSignature;
        private Set<String> mDeviceParameterBlockList;
        private final String mDirectoryServerId;
        private final String mDirectoryServerPublicKey;
        private final String mDirectoryServerRootCertificates;
        private Set<String> mMaliciousApps;
        private Set<String> mTrustedAppStores;

        public Builder(@NonNull String str, @NonNull String str2, @NonNull String str3) {
            this.mDirectoryServerId = str;
            this.mDirectoryServerPublicKey = str2;
            this.mDirectoryServerRootCertificates = str3;
        }

        public final Builder appSignature(String str) {
            this.mAppSignature = str;
            return this;
        }

        public final ConfigParameters build() throws InvalidInputException {
            Preconditions.requireNonEmpty("directoryServerId", this.mDirectoryServerId);
            Preconditions.requireNonEmpty("directoryServerPublicKey", this.mDirectoryServerPublicKey);
            Preconditions.requireNonEmpty("directoryServerRootCertificates", this.mDirectoryServerRootCertificates);
            ConfigParameters configParameters = new ConfigParameters();
            AdyenConfigParameters.addParam(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_ID, this.mDirectoryServerId);
            AdyenConfigParameters.addParam(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_PUBLIC_KEY, this.mDirectoryServerPublicKey);
            AdyenConfigParameters.addParam(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_ROOT_CERTIFICATES, this.mDirectoryServerRootCertificates);
            String str = this.mAppSignature;
            if (str != null) {
                AdyenConfigParameters.addParam(configParameters, AdyenConfigParameters.SECURITY_APP_SIGNATURE, str);
            }
            Set<String> set = this.mTrustedAppStores;
            if (set != null) {
                AdyenConfigParameters.addParam(configParameters, AdyenConfigParameters.SECURITY_TRUSTED_APP_STORES, set);
            }
            Set<String> set2 = this.mMaliciousApps;
            if (set2 != null) {
                AdyenConfigParameters.addParam(configParameters, AdyenConfigParameters.SECURITY_MALICIOUS_APPS, set2);
            }
            Set<String> set3 = this.mDeviceParameterBlockList;
            if (set3 != null) {
                AdyenConfigParameters.addParam(configParameters, AdyenConfigParameters.DEVICE_PARAMETER_BLOCK_LIST, set3);
            }
            return configParameters;
        }

        public final Builder deviceParameterBlockList(Set<String> set) {
            this.mDeviceParameterBlockList = set;
            return this;
        }

        public final Builder maliciousApps(Set<String> set) {
            this.mMaliciousApps = set;
            return this;
        }

        public final Builder trustedAppStores(Set<String> set) {
            this.mTrustedAppStores = set;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Parameter {
        private final String mGroup;
        private final String mParamName;

        public Parameter(String str, String str2) {
            this.mGroup = str;
            this.mParamName = str2;
        }

        public final String getGroup() {
            return this.mGroup;
        }

        public final String getParamName() {
            return this.mParamName;
        }
    }

    private AdyenConfigParameters() {
        throw new IllegalStateException("No instances.");
    }

    public static void addParam(ConfigParameters configParameters, Parameter parameter, String str) throws InvalidInputException {
        Preconditions.requireNonNull("configParameters", configParameters);
        Preconditions.requireNonNull("parameter", parameter);
        Preconditions.requireNonEmpty("paramValue", str);
        configParameters.addParam(parameter.getGroup(), parameter.getParamName(), str);
    }

    public static String getParamValue(ConfigParameters configParameters, Parameter parameter) throws InvalidInputException {
        Preconditions.requireNonNull("configParameters", configParameters);
        Preconditions.requireNonNull("parameter", parameter);
        return configParameters.getParamValue(parameter.getGroup(), parameter.getParamName());
    }

    public static Collection<String> getParamValues(ConfigParameters configParameters, Parameter parameter) throws InvalidInputException {
        String paramValue = getParamValue(configParameters, parameter);
        if (paramValue == null) {
            return null;
        }
        return Arrays.asList(paramValue.split(COLLECTION_DELIMITER));
    }

    public static void addParam(ConfigParameters configParameters, Parameter parameter, Collection<String> collection) throws InvalidInputException {
        Preconditions.requireNonNull("paramValues", collection);
        addParam(configParameters, parameter, TextUtils.join(COLLECTION_DELIMITER, collection));
    }
}
