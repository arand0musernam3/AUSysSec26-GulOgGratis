package com.adyen.threeds2.parameters;

import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.util.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ConfigParameters {
    private final Map<String, Map<String, String>> mParameters = new HashMap();

    private Map<String, String> getParametersForGroup(String str, boolean z11) {
        Map<String, String> map = this.mParameters.get(str);
        if (!z11 || map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        this.mParameters.put(str, map2);
        return map2;
    }

    public final void addParam(String str, String str2, String str3) throws InvalidInputException {
        Preconditions.requireNonNull("paramName", str2);
        getParametersForGroup(str, true).put(str2, str3);
    }

    public final Map<String, String> getGroup(String str) {
        return getParametersForGroup(str, false);
    }

    public final String getParamValue(String str, String str2) throws InvalidInputException {
        Preconditions.requireNonNull("paramName", str2);
        Map<String, String> parametersForGroup = getParametersForGroup(str, false);
        if (parametersForGroup != null) {
            return parametersForGroup.get(str2);
        }
        return null;
    }

    public final String removeParam(String str, String str2) throws InvalidInputException {
        Preconditions.requireNonNull("paramName", str2);
        Map<String, String> parametersForGroup = getParametersForGroup(str, false);
        if (parametersForGroup != null) {
            return parametersForGroup.remove(str2);
        }
        return null;
    }
}
