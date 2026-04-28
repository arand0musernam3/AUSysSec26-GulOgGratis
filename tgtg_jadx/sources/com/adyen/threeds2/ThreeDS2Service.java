package com.adyen.threeds2;

import android.content.Context;
import androidx.annotation.NonNull;
import atd.e.ChallengeResultError;
import com.adyen.threeds2.customization.UiCustomization;
import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.exception.SDKNotInitializedException;
import com.adyen.threeds2.parameters.ConfigParameters;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface ThreeDS2Service {
    public static final ThreeDS2Service INSTANCE = ChallengeResultError.getDeviceData;

    void cleanup(Context context);

    TransactionResult createTransaction(String str, @NonNull String str2) throws InvalidInputException, SDKNotInitializedException;

    String getSDKVersion();

    List<Warning> getWarnings();

    InitializeResult initialize(Context context, ConfigParameters configParameters, String str, UiCustomization uiCustomization) throws InvalidInputException;
}
