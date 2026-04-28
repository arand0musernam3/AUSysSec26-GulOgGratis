package com.adyen.threeds2.internal.ui.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.y;
import atd.g.AuthenticationRequestParameters;
import com.adyen.threeds2.R;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getDeviceData extends y {
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKReferenceNumber = 1;

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getDeviceData getdevicedata = new getDeviceData();
        int i11 = getSDKReferenceNumber + 43;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return getdevicedata;
        }
        throw null;
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
        int i17 = i12 | i15;
        int i18 = (i17 * (-1605095679)) + ((-484454144) * i14) + (i12 * (-484454144)) + 743702528;
        int i19 = ~((~i15) | i12);
        int i21 = ~i12;
        int i22 = i19 | (~(i21 | i14 | i15));
        int i23 = (~(i15 | i21)) | i14;
        int i24 = ((-1434976256) * i13) + (367263744 * i11) + ((-2089549824) * i16) + ((-1605095679) * i23) + (1605095679 * i22) + i18;
        int iC = a0.c(i13, 1026174006, (2127773517 * i11) + i12 + i14 + i16);
        int i25 = i17 * 947;
        int i26 = i22 * (-947);
        int i27 = i23 * 947;
        int i28 = i16 * 21309107;
        int i29 = i11 * 1708896471;
        int i31 = i13 * 664464834;
        if (a0.e(iC, 287244288, i31 + i29 + i28 + i27 + i26 + i25 + (i14 * 21308160) + (i12 * 21308160) + 1622758390, 966983680, (1105526784 * iC) + i24) == 1) {
            return AuthenticationRequestParameters(objArr);
        }
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        LayoutInflater layoutInflater = (LayoutInflater) objArr[1];
        ViewGroup viewGroup = (ViewGroup) objArr[2];
        getdevicedata.getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getdevicedata.setCancelable(false);
        View viewInflate = layoutInflater.inflate(R.layout.a3ds2_widget_progress_dialog, viewGroup, false);
        int i32 = AuthenticationRequestParameters;
        int i33 = i32 & 115;
        int i34 = -(-((i32 ^ 115) | i33));
        getSDKReferenceNumber = ((i33 & i34) + (i34 | i33)) % 128;
        return viewInflate;
    }

    public static getDeviceData getSDKReferenceNumber() {
        int deviceData = AuthenticationRequestParameters.getSDKReferenceNumber.getDeviceData();
        int deviceData2 = AuthenticationRequestParameters.getSDKReferenceNumber.getDeviceData();
        return (getDeviceData) getDeviceData(AuthenticationRequestParameters.getSDKReferenceNumber.getDeviceData(), -1616448390, AuthenticationRequestParameters.getSDKReferenceNumber.getDeviceData(), 1616448391, new Object[0], deviceData, deviceData2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int deviceData = AuthenticationRequestParameters.getSDKReferenceNumber.getDeviceData();
        int deviceData2 = AuthenticationRequestParameters.getSDKReferenceNumber.getDeviceData();
        return (View) getDeviceData(AuthenticationRequestParameters.getSDKReferenceNumber.getDeviceData(), 224690725, AuthenticationRequestParameters.getSDKReferenceNumber.getDeviceData(), -224690725, new Object[]{this, layoutInflater, viewGroup, bundle}, deviceData, deviceData2);
    }
}
