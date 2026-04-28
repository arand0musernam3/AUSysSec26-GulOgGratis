package atd.at;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.z;
import atd.y.getSDKAppID;
import com.adyen.threeds2.ProgressDialog;
import com.adyen.threeds2.R;
import k.c;
import k.f;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKAppID implements DialogInterface.OnDismissListener, ProgressDialog {
    private static int getDeviceData = 0;
    private static int getSDKReferenceNumber = 1;
    private final DialogInterface.OnDismissListener AuthenticationRequestParameters;
    private f getSDKAppID;

    public getSDKAppID(@NonNull Activity activity, @NonNull DialogInterface.OnDismissListener onDismissListener) {
        this.AuthenticationRequestParameters = onDismissListener;
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.a3ds2_widget_progress_dialog, (ViewGroup) null);
        z zVar = new z(activity, R.style.ThreeDS2Theme_ProgressDialog);
        c cVar = (c) zVar.f2543c;
        cVar.f25529m = viewInflate;
        cVar.f25526i = false;
        f fVarG = zVar.g();
        this.getSDKAppID = fVarG;
        fVarG.setOnDismissListener(this);
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = getDeviceData;
        int i12 = i11 ^ 107;
        int i13 = ((i11 & 107) | i12) << 1;
        int i14 = -i12;
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        getSDKReferenceNumber = i15 % 128;
        if (i15 % 2 == 0) {
            f fVar = getsdkappid.getSDKAppID;
            throw null;
        }
        f fVar2 = getsdkappid.getSDKAppID;
        if (fVar2 != null) {
            int i16 = i11 & 25;
            int i17 = (i11 ^ 25) | i16;
            getSDKReferenceNumber = ((i16 & i17) + (i17 | i16)) % 128;
            fVar2.show();
            int i18 = getSDKReferenceNumber;
            int i19 = i18 & 119;
            int i21 = i18 | 119;
            getDeviceData = ((i19 & i21) + (i21 | i19)) % 128;
        }
        int i22 = getDeviceData;
        getSDKReferenceNumber = a0.d((i22 & (-66)) | ((~i22) & 65), ~((i22 & 65) << 1), 1, 128);
        return null;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        DialogInterface dialogInterface = (DialogInterface) objArr[1];
        int i11 = getSDKReferenceNumber;
        getDeviceData = (((i11 & 44) + (i11 | 44)) - 1) % 128;
        getsdkappid.getSDKAppID = null;
        getsdkappid.AuthenticationRequestParameters.onDismiss(dialogInterface);
        int i12 = getDeviceData;
        int i13 = i12 | 29;
        int i14 = i13 << 1;
        int i15 = -((~(i12 & 29)) & i13);
        int i16 = (i14 & i15) + (i15 | i14);
        getSDKReferenceNumber = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 89 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object getSDKTransactionID(int i11, int i12, int i13, int i14, int i15, int i16, Object[] objArr) {
        int i17 = ~i12;
        int i18 = ~i14;
        int i19 = ~i11;
        int i21 = (~(i18 | i19)) | i17;
        int i22 = ~(i18 | i12 | i11);
        int i23 = (~(i11 | i12)) | (~(i17 | i19)) | i18;
        int i24 = (1722810368 * i15) + ((-1298137088) * i16) + (1516765184 * i13) + ((-1194288187) * i23) + (1194288187 * i22) + (i21 * 1194288187) + (322476998 * i14) + ((-1583913924) * i12) + 967573504;
        int iC = a0.c(i15, -2108786386, ((-1422066268) * i16) + i12 + i14 + i13);
        int i25 = i23 * 261;
        int i26 = i13 * 793896001;
        int i27 = i16 * 692483748;
        int i28 = i15 * (-1016611666);
        int iE = a0.e(iC, 166461440, i28 + i27 + i26 + i25 + (i22 * (-261)) + (i21 * (-261)) + (i14 * 793896262) + (i12 * 793895740) + 1353643607, 1997799424, (518782976 * iC) + i24);
        return iE != 1 ? iE != 2 ? AuthenticationRequestParameters(objArr) : getDeviceData(objArr) : getSDKTransactionID(objArr);
    }

    @Override // com.adyen.threeds2.ProgressDialog
    public final void hide() {
        int iAuthenticationRequestParameters = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        getSDKTransactionID(iAuthenticationRequestParameters, 1839906561, iAuthenticationRequestParameters2, -1839906560, getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), iAuthenticationRequestParameters3, new Object[]{this});
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int iAuthenticationRequestParameters = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        getSDKTransactionID(iAuthenticationRequestParameters, -1264803081, iAuthenticationRequestParameters2, 1264803083, getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), iAuthenticationRequestParameters3, new Object[]{this, dialogInterface});
    }

    @Override // com.adyen.threeds2.ProgressDialog
    public final void show() {
        int iAuthenticationRequestParameters = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        getSDKTransactionID(iAuthenticationRequestParameters, -1763180061, iAuthenticationRequestParameters2, 1763180061, getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), iAuthenticationRequestParameters3, new Object[]{this});
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        int i11;
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i12 = getSDKReferenceNumber;
        int i13 = ((i12 ^ 9) + ((i12 & 9) << 1)) % 128;
        getDeviceData = i13;
        f fVar = getsdkappid.getSDKAppID;
        if (fVar != null) {
            int i14 = (i13 & 41) + (i13 | 41);
            getSDKReferenceNumber = i14 % 128;
            try {
                if (i14 % 2 != 0) {
                    fVar.dismiss();
                    int i15 = getDeviceData;
                    int i16 = i15 & 7;
                    int i17 = (i15 | 7) & (~i16);
                    int i18 = -(-(i16 << 1));
                    i11 = ((i17 | i18) << 1) - (i17 ^ i18);
                } else {
                    fVar.dismiss();
                    throw null;
                }
            } catch (IllegalStateException unused) {
                int i19 = getDeviceData;
                int i21 = i19 & 31;
                int i22 = (i19 | 31) & (~i21);
                int i23 = i21 << 1;
                i11 = (i22 & i23) + (i22 | i23);
            }
        } else {
            int i192 = getDeviceData;
            int i212 = i192 & 31;
            int i222 = (i192 | 31) & (~i212);
            int i232 = i212 << 1;
            i11 = (i222 & i232) + (i222 | i232);
        }
        getSDKReferenceNumber = i11 % 128;
        return null;
    }
}
