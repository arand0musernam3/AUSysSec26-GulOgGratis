package atd.au;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import atd.bb.ChallengeResultCompleted;
import atd.c.ChallengeResultTimeout;
import atd.c.getAdditionalDetails;
import atd.c.getTransactionStatus;
import atd.d.AuthenticationRequestParameters;
import atd.k.ChallengeStatusReceiver;
import atd.n.getSDKReferenceNumber;
import atd.y.BuildConfig;
import atd.y.protocolError;
import com.adyen.threeds2.R;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKEphemeralPublicKey extends atd.au.getSDKReferenceNumber<getAdditionalDetails, atd.ax.getDeviceData> implements View.OnClickListener {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char getMessageVersion;
    private static char getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;
    private final Set<ChallengeResultTimeout> AuthenticationRequestParameters;
    private final ListView getDeviceData;
    private final Button getSDKAppID;

    /* JADX INFO: renamed from: atd.au.getSDKEphemeralPublicKey$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static /* synthetic */ class AnonymousClass4 {
        private static int getSDKAppID = 1;
        private static int getSDKReferenceNumber;
        static final /* synthetic */ int[] getSDKTransactionID;

        static {
            int[] iArr = new int[atd.h.getSDKTransactionID.values().length];
            getSDKTransactionID = iArr;
            try {
                iArr[atd.h.getSDKTransactionID.SINGLE_SELECT.ordinal()] = 1;
                int i11 = getSDKAppID;
                getSDKReferenceNumber = (((i11 | 43) << 1) - (i11 ^ 43)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getSDKTransactionID[atd.h.getSDKTransactionID.MULTI_SELECT.ordinal()] = 2;
                int i12 = getSDKAppID;
                int i13 = ((i12 & 107) - (~(-(-(i12 | 107))))) - 1;
                getSDKReferenceNumber = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public abstract class AuthenticationRequestParameters implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
        private static int ChallengeResult = 1;
        private static int getSDKAppID;
        final View AuthenticationRequestParameters;
        private TextView getDeviceData;
        final CompoundButton getSDKTransactionID;

        public AuthenticationRequestParameters(View view) {
            this.AuthenticationRequestParameters = view;
            view.setOnClickListener(this);
            this.getDeviceData = (TextView) view.findViewById(R.id.textView_value);
            CompoundButton compoundButton = (CompoundButton) view.findViewById(R.id.checkBox_selected);
            this.getSDKTransactionID = compoundButton;
            compoundButton.setOnCheckedChangeListener(this);
        }

        public final void getSDKTransactionID(ChallengeResultTimeout challengeResultTimeout) {
            ChallengeResult = (getSDKAppID + 119) % 128;
            TextView textView = this.getDeviceData;
            int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
            int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
            int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
            textView.setText((String) ChallengeResultTimeout.getSDKAppID(sDKReferenceNumber2, sDKReferenceNumber, 826877567, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{challengeResultTimeout}, -826877565, sDKReferenceNumber3));
            this.getSDKTransactionID.setTag(challengeResultTimeout);
            this.getSDKTransactionID.setChecked(getSDKEphemeralPublicKey.this.getSDKAppID(challengeResultTimeout));
            int i11 = ChallengeResult;
            int i12 = i11 & 101;
            int i13 = ((i11 ^ 101) | i12) << 1;
            int i14 = -((i11 | 101) & (~i12));
            int i15 = (i13 & i14) + (i14 | i13);
            getSDKAppID = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public final class getDeviceData extends AuthenticationRequestParameters {
        private static int getSDKAppID = 0;
        private static int getSDKReferenceNumber = 1;

        public getDeviceData(View view) {
            super(view);
        }

        private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            CompoundButton compoundButton = (CompoundButton) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i11 = getSDKAppID;
            int i12 = (i11 | 39) << 1;
            int i13 = -(((~i11) & 39) | (i11 & (-40)));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            int i15 = i14 % 128;
            getSDKReferenceNumber = i15;
            if (i14 % 2 == 0) {
                throw null;
            }
            if (zBooleanValue) {
                getSDKAppID = k.c(i15 & 74, i15 | 74, 1, 128);
                ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) compoundButton.getTag();
                getSDKEphemeralPublicKey.this.ChallengeResult();
                getSDKEphemeralPublicKey.this.getSDKTransactionID(challengeResultTimeout);
                getSDKEphemeralPublicKey.this.getMessageVersion();
                getSDKEphemeralPublicKey.this.getDeviceData(challengeResultTimeout);
                getSDKAppID = (getSDKReferenceNumber + 51) % 128;
            }
            int i16 = getSDKReferenceNumber;
            getSDKAppID = (((i16 | 109) << 1) - (i16 ^ 109)) % 128;
            return null;
        }

        public static /* synthetic */ Object getDeviceData(int i11, Object[] objArr, int i12, int i13, int i14, int i15, int i16) {
            int i17 = ~(i11 | i13 | i15);
            int i18 = ~i13;
            int i19 = (~(i18 | i15)) | (~((~i15) | i11));
            int i21 = (~(i15 | (~i11))) | i18;
            int i22 = ((-299892736) * i16) + (689963008 * i12) + (606076928 * i14) + ((-441125413) * i21) + (441125413 * i19) + (i17 * 441125413) + (164951516 * i13) + ((1047202342 * i11) - 713031680);
            int iC = a0.c(i16, 1743660113, ((-2044576983) * i12) + i11 + i13 + i14);
            if (a0.e(iC, 1885470720, (i16 * (-1448904853)) + (i12 * 2142076211) + (i14 * 2048728315) + (i21 * 441) + (i19 * (-441)) + (i17 * (-441)) + (i13 * 2048728756) + ((i11 * 2048727874) - 782056376), -1618345984, ((-1081737216) * iC) + i22) != 1) {
                return AuthenticationRequestParameters(objArr);
            }
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            int i23 = getSDKAppID;
            getSDKReferenceNumber = ((-2) - (((i23 ^ 102) + ((i23 & 102) << 1)) ^ (-1))) % 128;
            if (!getdevicedata.getSDKTransactionID.isChecked()) {
                int i24 = getSDKAppID;
                int i25 = (i24 & 89) + (i24 | 89);
                getSDKReferenceNumber = i25 % 128;
                int i26 = i25 % 2;
                getdevicedata.getSDKTransactionID.setChecked(true);
                int i27 = getSDKReferenceNumber;
                getSDKAppID = ((i27 ^ 47) + ((i27 & 47) << 1)) % 128;
            }
            int i28 = getSDKAppID;
            getSDKReferenceNumber = a0.d((i28 | 117) << 1, ~(-(i28 ^ 117)), 1, 128);
            return null;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            Object[] objArr = {this, compoundButton, Boolean.valueOf(z11)};
            int sDKTransactionID = AuthenticationRequestParameters.AnonymousClass4.getSDKTransactionID();
            getDeviceData(650734904, objArr, AuthenticationRequestParameters.AnonymousClass4.getSDKTransactionID(), -650734904, AuthenticationRequestParameters.AnonymousClass4.getSDKTransactionID(), sDKTransactionID, AuthenticationRequestParameters.AnonymousClass4.getSDKTransactionID());
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int sDKTransactionID = AuthenticationRequestParameters.AnonymousClass4.getSDKTransactionID();
            getDeviceData(-1710892843, new Object[]{this, view}, AuthenticationRequestParameters.AnonymousClass4.getSDKTransactionID(), 1710892844, AuthenticationRequestParameters.AnonymousClass4.getSDKTransactionID(), sDKTransactionID, AuthenticationRequestParameters.AnonymousClass4.getSDKTransactionID());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public abstract class getSDKReferenceNumber extends BaseAdapter {
        private static int AuthenticationRequestParameters = 1;
        private static int getSDKReferenceNumber;
        private final List<ChallengeResultTimeout> getSDKAppID;

        public getSDKReferenceNumber(List<ChallengeResultTimeout> list) {
            this.getSDKAppID = list;
        }

        private ChallengeResultTimeout AuthenticationRequestParameters(int i11) {
            int i12 = AuthenticationRequestParameters;
            int i13 = (i12 & (-126)) | ((~i12) & 125);
            int i14 = -(-((i12 & 125) << 1));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            getSDKReferenceNumber = i15 % 128;
            int i16 = i15 % 2;
            ChallengeResultTimeout challengeResultTimeout = this.getSDKAppID.get(i11);
            if (i16 != 0) {
                int i17 = 24 / 0;
            }
            int i18 = getSDKReferenceNumber;
            int i19 = (i18 & (-80)) | ((~i18) & 79);
            int i21 = (i18 & 79) << 1;
            AuthenticationRequestParameters = (((i19 | i21) << 1) - (i21 ^ i19)) % 128;
            return challengeResultTimeout;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int i11 = getSDKReferenceNumber;
            int i12 = ((i11 ^ 97) | (i11 & 97)) << 1;
            int i13 = -(((~i11) & 97) | (i11 & (-98)));
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            AuthenticationRequestParameters = i14 % 128;
            int i15 = i14 % 2;
            List<ChallengeResultTimeout> list = this.getSDKAppID;
            if (i15 != 0) {
                return list.size();
            }
            list.size();
            throw null;
        }

        @Override // android.widget.Adapter
        public /* synthetic */ Object getItem(int i11) {
            int i12 = AuthenticationRequestParameters;
            int i13 = i12 & 53;
            int i14 = ((i12 ^ 53) | i13) << 1;
            int i15 = -((i12 | 53) & (~i13));
            getSDKReferenceNumber = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
            ChallengeResultTimeout challengeResultTimeoutAuthenticationRequestParameters = AuthenticationRequestParameters(i11);
            int i16 = getSDKReferenceNumber;
            int i17 = ((((i16 ^ 91) | (i16 & 91)) << 1) - (~(-(((~i16) & 91) | (i16 & (-92)))))) - 1;
            AuthenticationRequestParameters = i17 % 128;
            if (i17 % 2 != 0) {
                return challengeResultTimeoutAuthenticationRequestParameters;
            }
            throw null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            long j9;
            int i12 = AuthenticationRequestParameters;
            int i13 = i12 & 89;
            int i14 = (i13 - (~(-(-((i12 ^ 89) | i13))))) - 1;
            getSDKReferenceNumber = i14 % 128;
            if (i14 % 2 != 0) {
                j9 = i11;
                int i15 = 81 / 0;
            } else {
                j9 = i11;
            }
            int i16 = i12 & 77;
            int i17 = i16 + ((i12 ^ 77) | i16);
            getSDKReferenceNumber = i17 % 128;
            if (i17 % 2 == 0) {
                return j9;
            }
            throw null;
        }

        public abstract AuthenticationRequestParameters getSDKAppID(ViewGroup viewGroup);

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            int i12 = getSDKReferenceNumber;
            AuthenticationRequestParameters = a0.d((i12 & (-4)) | ((~i12) & 3), ~((i12 & 3) << 1), 1, 128);
            AuthenticationRequestParameters sDKAppID = getSDKAppID(viewGroup);
            sDKAppID.getSDKTransactionID(AuthenticationRequestParameters(i11));
            View view2 = sDKAppID.AuthenticationRequestParameters;
            int i13 = AuthenticationRequestParameters;
            int i14 = i13 & 103;
            getSDKReferenceNumber = a0.d((i13 | 103) & (~i14), ~(-(-(i14 << 1))), 1, 128);
            return view2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(int r6, short r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 66
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = atd.au.getSDKEphemeralPublicKey.$$d
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.au.getSDKEphemeralPublicKey.$$f(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        ChallengeResult = 1;
        getSDKReferenceNumber = (char) 22381;
        getSDKTransactionID = (char) 52880;
        getMessageVersion = (char) 24025;
        getSDKEphemeralPublicKey = (char) 21687;
    }

    public getSDKEphemeralPublicKey(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.AuthenticationRequestParameters = new LinkedHashSet();
        setId(R.id.selectChallengeView);
        this.getDeviceData = (ListView) findViewById(R.id.listView_selectInfoItems);
        this.getSDKAppID = (Button) findViewById(R.id.button_next);
    }

    private void AuthenticationRequestParameters(getAdditionalDetails getadditionaldetails) {
        List<ChallengeResultTimeout> listCompleted = getadditionaldetails.completed();
        ChallengeResult();
        getSDKTransactionID(listCompleted.get(0));
        this.getDeviceData.setAdapter((ListAdapter) new getSDKReferenceNumber(listCompleted) { // from class: atd.au.getSDKEphemeralPublicKey.1
            private static int getSDKAppID = 1;
            private static int getSDKTransactionID;

            @Override // atd.au.getSDKEphemeralPublicKey.getSDKReferenceNumber
            public final AuthenticationRequestParameters getSDKAppID(ViewGroup viewGroup) {
                getDeviceData getdevicedata = getSDKEphemeralPublicKey.this.new getDeviceData(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3ds2_view_single_select_item, viewGroup, false));
                int i11 = getSDKTransactionID;
                int i12 = i11 & 35;
                int i13 = ((i11 ^ 35) | i12) << 1;
                int i14 = -((i11 | 35) & (~i12));
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                getSDKAppID = i15 % 128;
                if (i15 % 2 != 0) {
                    return getdevicedata;
                }
                throw null;
            }
        });
        int i11 = ChallengeResultCancelled + 79;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        int i12;
        char c3;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr = new char[charArray.length];
        challengeResultCompleted.getDeviceData = 0;
        int i13 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i14 = challengeResultCompleted.getDeviceData;
            if (i14 >= charArray.length) {
                String str2 = new String(cArr, 0, i11);
                $11 = ($10 + 35) % 128;
                objArr[0] = str2;
                return;
            }
            cArr2[0] = charArray[i14];
            char c7 = 1;
            cArr2[1] = charArray[i14 + 1];
            $10 = ($11 + 41) % 128;
            int i15 = 58224;
            int i16 = 0;
            while (i16 < 16) {
                char c8 = cArr2[c7];
                char c11 = cArr2[0];
                char c12 = c7;
                int i17 = i13;
                char[] cArr3 = cArr2;
                int i18 = (c11 + i15) ^ ((c11 << 4) + ((char) (((long) getMessageVersion) ^ 5320350835299930193L)));
                int i19 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKEphemeralPublicKey);
                    objArr2[i17] = Integer.valueOf(i19);
                    objArr2[c12] = Integer.valueOf(i18);
                    objArr2[0] = Integer.valueOf(c8);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) 0;
                        i12 = 906025703;
                        byte b11 = b8;
                        c3 = 3;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(TextUtils.indexOf("", "", 0, 0) + 2828, (char) (Process.myTid() >> 22), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26, -362226441, false, $$f(b8, b11, b11), new Class[]{cls, cls, cls, cls});
                    } else {
                        i12 = 906025703;
                        c3 = 3;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[c12] = cCharValue;
                    char c13 = cArr3[0];
                    int i21 = (cCharValue + i15) ^ ((cCharValue << 4) + ((char) (((long) getSDKReferenceNumber) ^ 5320350835299930193L)));
                    int i22 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[c3] = Integer.valueOf(getSDKTransactionID);
                    objArr3[i17] = Integer.valueOf(i22);
                    objArr3[c12] = Integer.valueOf(i21);
                    objArr3[0] = Integer.valueOf(c13);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i12);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2828 - View.MeasureSpec.getSize(0), (char) View.MeasureSpec.getSize(0), 28 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -362226441, false, $$f(b12, b13, b13), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i15 -= 40503;
                    i16++;
                    c7 = c12;
                    i13 = i17;
                    cArr2 = cArr3;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i23 = i13;
            char[] cArr4 = cArr2;
            char c14 = c7;
            int i24 = challengeResultCompleted.getDeviceData;
            cArr[i24] = cArr4[0];
            cArr[i24 + 1] = cArr4[c14];
            i13 = i23;
            Object[] objArr4 = new Object[i13];
            objArr4[c14] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 + 1);
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getPressedStateDuration() >> 16) + 3156, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25796), 27 - KeyEvent.keyCodeFromString(""), 1296942946, false, $$f(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            cArr2 = cArr4;
        }
    }

    public static /* synthetic */ Object getSDKReferenceNumber(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
        int i17 = ~i13;
        int i18 = (~(i17 | i11)) | i14;
        int i19 = (i18 * 1776748468) + ((-2147356519) * i14) + ((-370608051) * i13) + 147849216;
        int i21 = ~i14;
        int i22 = ~(i17 | i21);
        int i23 = ~i11;
        int i24 = i22 | (~(i21 | i23));
        int i25 = (~(i11 | i21)) | (~(i17 | i23));
        int i26 = 1406140416 * i15;
        int i27 = (-354418688) * i12;
        int i28 = ((-85983232) * i16) + i27 + i26 + (1776748468 * i25) + (i24 * 1776748468) + i19;
        int iC = a0.c(i16, 566850886, (417615942 * i12) + i13 + i14 + i15);
        int i29 = i18 * 108;
        int i31 = i24 * 108;
        int i32 = i25 * 108;
        int i33 = i15 * (-1357469401);
        int i34 = i12 * 1137340586;
        int i35 = i16 * 304092074;
        int iE = a0.e(iC, 1282146304, i35 + i34 + i33 + i32 + i31 + i29 + (i14 * (-1357469617)) + (i13 * (-1357469509)) + 140661806, 1158414336, ((-608960512) * iC) + i28);
        if (iE == 1) {
            return getSDKReferenceNumber(objArr);
        }
        if (iE == 2) {
            getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[0];
            getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[1];
            ChallengeResultCancelled = (ChallengeResult + 29) % 128;
            super.getDeviceData(gettransactionstatus);
            ChallengeResultCancelled = (ChallengeResult + 69) % 128;
            return null;
        }
        getSDKEphemeralPublicKey getsdkephemeralpublickey2 = (getSDKEphemeralPublicKey) objArr[0];
        getSDKAppID getsdkappid = (getSDKAppID) objArr[1];
        ChallengeResult = (ChallengeResultCancelled + 49) % 128;
        getsdkephemeralpublickey2.ChallengeResult();
        int deviceData = atd.ar.getSDKReferenceNumber.getDeviceData();
        int deviceData2 = atd.ar.getSDKReferenceNumber.getDeviceData();
        int deviceData3 = atd.ar.getSDKReferenceNumber.getDeviceData();
        Iterator it = ((Set) getSDKAppID.AuthenticationRequestParameters(atd.ar.getSDKReferenceNumber.getDeviceData(), 1435695435, new Object[]{getsdkappid}, -1435695435, deviceData2, deviceData, deviceData3)).iterator();
        while (it.hasNext()) {
            getsdkephemeralpublickey2.getSDKTransactionID((ChallengeResultTimeout) it.next());
            ChallengeResult = (ChallengeResultCancelled + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        }
        getsdkephemeralpublickey2.getMessageVersion();
        Iterator<ChallengeResultTimeout> it2 = getsdkephemeralpublickey2.AuthenticationRequestParameters.iterator();
        ChallengeResult = (ChallengeResultCancelled + 111) % 128;
        while (it2.hasNext()) {
            getsdkephemeralpublickey2.getDeviceData(it2.next());
        }
        return null;
    }

    @NonNull
    private static List<String> getSDKTransactionID(Set<ChallengeResultTimeout> set) {
        ArrayList arrayList = new ArrayList();
        Iterator<ChallengeResultTimeout> it = set.iterator();
        while (it.hasNext()) {
            int i11 = ChallengeResult + 83;
            ChallengeResultCancelled = i11 % 128;
            if (i11 % 2 != 0) {
                Object[] objArr = {it.next()};
                int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
                arrayList.add((String) ChallengeResultTimeout.getSDKAppID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), sDKReferenceNumber, -731051330, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), objArr, 731051330, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber()));
                int i12 = 38 / 0;
            } else {
                Object[] objArr2 = {it.next()};
                int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
                arrayList.add((String) ChallengeResultTimeout.getSDKAppID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), sDKReferenceNumber2, -731051330, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), objArr2, 731051330, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber()));
            }
        }
        int i13 = ChallengeResult + 85;
        ChallengeResultCancelled = i13 % 128;
        if (i13 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public static void init$0() {
        $$d = new byte[]{39, 8, -31, -31};
        $$e = 251;
    }

    public final void ChallengeResult() {
        int i11 = ChallengeResultCancelled + 85;
        ChallengeResult = i11 % 128;
        int i12 = i11 % 2;
        Set<ChallengeResultTimeout> set = this.AuthenticationRequestParameters;
        if (i12 != 0) {
            set.clear();
        } else {
            set.clear();
            throw null;
        }
    }

    public final void getDeviceData(ChallengeResultTimeout challengeResultTimeout) {
        int i11 = ChallengeResultCancelled + 99;
        ChallengeResult = i11 % 128;
        for (int i12 = i11 % 2 == 0 ? 1 : 0; i12 < this.getDeviceData.getChildCount(); i12++) {
            CompoundButton compoundButton = (CompoundButton) ((ViewGroup) this.getDeviceData.getChildAt(i12)).findViewById(R.id.checkBox_selected);
            if (compoundButton.getTag().equals(challengeResultTimeout)) {
                ChallengeResult = (ChallengeResultCancelled + 9) % 128;
                compoundButton.setChecked(true);
            }
        }
    }

    public final void getMessageVersion() {
        ChallengeResult = (ChallengeResultCancelled + 31) % 128;
        for (int i11 = 0; i11 < this.getDeviceData.getChildCount(); i11++) {
            ChallengeResult = (ChallengeResultCancelled + 115) % 128;
            CompoundButton compoundButton = (CompoundButton) ((ViewGroup) this.getDeviceData.getChildAt(i11)).findViewById(R.id.checkBox_selected);
            if (compoundButton.isChecked()) {
                int i12 = ChallengeResult + 105;
                ChallengeResultCancelled = i12 % 128;
                int i13 = i12 % 2;
                compoundButton.setChecked(false);
            }
        }
        int i14 = ChallengeResult + 71;
        ChallengeResultCancelled = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 90 / 0;
        }
    }

    public final boolean getSDKAppID(ChallengeResultTimeout challengeResultTimeout) {
        ChallengeResult = (ChallengeResultCancelled + 113) % 128;
        boolean zContains = this.AuthenticationRequestParameters.contains(challengeResultTimeout);
        ChallengeResult = (ChallengeResultCancelled + 51) % 128;
        return zContains;
    }

    @Override // atd.au.getSDKReferenceNumber, android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = ChallengeResultCancelled + 83;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            super.onClick(view);
            getSDKTransactionID();
            throw null;
        }
        super.onClick(view);
        if (getSDKTransactionID() == 0 || !view.equals(this.getSDKAppID)) {
            return;
        }
        this.getSDKAppID.setEnabled(false);
        List<String> sDKTransactionID = getSDKTransactionID(this.AuthenticationRequestParameters);
        if (!sDKTransactionID.isEmpty()) {
            ((atd.ax.getDeviceData) getSDKTransactionID()).getDeviceData(sDKTransactionID, BuildConfig());
            return;
        }
        int i12 = ChallengeResult + 107;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 == 0) {
            ((atd.ax.getDeviceData) getSDKTransactionID()).getSDKReferenceNumber(BuildConfig());
        } else {
            ((atd.ax.getDeviceData) getSDKTransactionID()).getSDKReferenceNumber(BuildConfig());
            throw null;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int deviceData = protocolError.getSDKTransactionID.getDeviceData();
        int deviceData2 = protocolError.getSDKTransactionID.getDeviceData();
        getSDKReferenceNumber(deviceData, protocolError.getSDKTransactionID.getDeviceData(), -1440911736, 1440911737, new Object[]{this, parcelable}, deviceData2, protocolError.getSDKTransactionID.getDeviceData());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        getSDKAppID getsdkappid = new getSDKAppID(super.onSaveInstanceState());
        Object[] objArr = {getsdkappid, this.AuthenticationRequestParameters};
        int deviceData = atd.ar.getSDKReferenceNumber.getDeviceData();
        getSDKAppID.AuthenticationRequestParameters(atd.ar.getSDKReferenceNumber.getDeviceData(), 464848719, objArr, -464848716, atd.ar.getSDKReferenceNumber.getDeviceData(), deviceData, atd.ar.getSDKReferenceNumber.getDeviceData());
        ChallengeResultCancelled = (ChallengeResult + 41) % 128;
        return getsdkappid;
    }

    public getSDKEphemeralPublicKey(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public getSDKEphemeralPublicKey(Context context) {
        this(context, null);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class getSDKAppID extends View.BaseSavedState {
        private static int AuthenticationRequestParameters = 1;
        public static final Parcelable.Creator<getSDKAppID> CREATOR = new Parcelable.Creator<getSDKAppID>() { // from class: atd.au.getSDKEphemeralPublicKey.getSDKAppID.4
            private static int AuthenticationRequestParameters = 1;
            private static int getSDKAppID;

            public static /* synthetic */ Object getSDKReferenceNumber(int i11, int i12, int i13, int i14, int i15, int i16, Object[] objArr) {
                int i17 = ~i16;
                int i18 = i11 | i17 | (~i15);
                int i19 = ~i11;
                int i21 = (i19 * (-4778405)) + (4778405 * i18) + ((-674687396) * i11) + (((-665130586) * i16) - 357761024);
                int i22 = (~(i15 | i17)) | (~(i17 | i19));
                int i23 = ((-742522880) * i12) + ((-1056047104) * i14) + ((-669908992) * i13) + ((-4778405) * i22) + i21;
                int iC = a0.c(i12, 1942122663, ((-92689393) * i14) + i16 + i11 + i13);
                int i24 = i19 * 307;
                int i25 = i22 * 307;
                int i26 = i13 * 1048061961;
                int i27 = i14 * 439444615;
                int i28 = i12 * (-1279783457);
                int iE = a0.e(iC, 173867008, i28 + i27 + i26 + i25 + i24 + (i18 * (-307)) + (i11 * 1048062268) + (i16 * 1048061654) + 1366922925, -1898250240, ((-592117760) * iC) + i23);
                if (iE == 1) {
                    int iIntValue = ((Number) objArr[0]).intValue();
                    int i29 = getSDKAppID;
                    int i31 = ((-2) - ((((i29 | 114) << 1) - (i29 ^ 114)) ^ (-1))) % 128;
                    AuthenticationRequestParameters = i31;
                    getSDKAppID[] getsdkappidArr = new getSDKAppID[iIntValue];
                    getSDKAppID = ((i31 & 93) + (i31 | 93)) % 128;
                    return getsdkappidArr;
                }
                if (iE == 2) {
                    int iIntValue2 = ((Number) objArr[1]).intValue();
                    int i32 = AuthenticationRequestParameters;
                    getSDKAppID = ((i32 ^ 75) + ((i32 & 75) << 1)) % 128;
                    Object[] objArr2 = {Integer.valueOf(iIntValue2)};
                    getSDKAppID[] getsdkappidArr2 = (getSDKAppID[]) getSDKReferenceNumber(-623422433, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), 623422434, objArr2);
                    int i33 = getSDKAppID;
                    AuthenticationRequestParameters = ((i33 & 13) + (i33 | 13)) % 128;
                    return getsdkappidArr2;
                }
                if (iE != 3) {
                    return getSDKTransactionID(objArr);
                }
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
                Parcel parcel = (Parcel) objArr[1];
                System.identityHashCode(anonymousClass4);
                System.identityHashCode(anonymousClass4);
                int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                getSDKAppID getsdkappid = (getSDKAppID) getSDKReferenceNumber(-462998246, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber, 462998246, new Object[]{parcel});
                int i34 = getSDKAppID;
                int i35 = i34 & 31;
                AuthenticationRequestParameters = ((((i34 ^ 31) | i35) << 1) - ((i34 | 31) & (~i35))) % 128;
                return getsdkappid;
            }

            private static getSDKAppID[] getSDKTransactionID(int i11) {
                Object[] objArr = {Integer.valueOf(i11)};
                int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                return (getSDKAppID[]) getSDKReferenceNumber(-623422433, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber, 623422434, objArr);
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [atd.au.getSDKEphemeralPublicKey$getSDKAppID, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getSDKAppID createFromParcel(Parcel parcel) {
                int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                return getSDKReferenceNumber(1329197693, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber2, sDKReferenceNumber3, sDKReferenceNumber, -1329197690, new Object[]{this, parcel});
            }

            /* JADX WARN: Type inference failed for: r8v3, types: [atd.au.getSDKEphemeralPublicKey$getSDKAppID[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getSDKAppID[] newArray(int i11) {
                Object[] objArr = {this, Integer.valueOf(i11)};
                int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                return (Object[]) getSDKReferenceNumber(-528444242, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber, 528444244, objArr);
            }

            private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
                getSDKAppID getsdkappid = new getSDKAppID((Parcel) objArr[0]);
                int i11 = AuthenticationRequestParameters;
                int i12 = ((i11 ^ 124) + ((i11 & 124) << 1)) - 1;
                getSDKAppID = i12 % 128;
                if (i12 % 2 == 0) {
                    return getsdkappid;
                }
                throw null;
            }

            private static getSDKAppID getSDKTransactionID(Parcel parcel) {
                int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
                return (getSDKAppID) getSDKReferenceNumber(-462998246, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber2, sDKReferenceNumber3, sDKReferenceNumber, 462998246, new Object[]{parcel});
            }
        };
        private static int getSDKAppID = 0;
        private static int getSDKReferenceNumber = 0;
        private static int getSDKTransactionID = 1;
        private Set<ChallengeResultTimeout> getDeviceData;

        static {
            int i11 = getSDKAppID;
            int i12 = i11 ^ 107;
            int i13 = -(-((i11 & 107) << 1));
            AuthenticationRequestParameters = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        }

        public getSDKAppID(Parcel parcel) {
            super(parcel);
            this.getDeviceData = new LinkedHashSet();
            Parcelable[] parcelableArray = parcel.readParcelableArray(ChallengeResultTimeout.class.getClassLoader());
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                int i11 = 0;
                while (i11 < length) {
                    this.getDeviceData.add((ChallengeResultTimeout) parcelableArray[i11]);
                    int i12 = i11 + 96;
                    i11 = ((i12 & (-95)) - (~(i12 | (-95)))) - 1;
                }
            }
        }

        public static /* synthetic */ Object AuthenticationRequestParameters(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
            int i17 = ~i13;
            int i18 = ~i12;
            int i19 = ~(i17 | i18);
            int i21 = (~((~i15) | i18)) | i19;
            int i22 = i13 | i12;
            int i23 = (~(i15 | i18)) | i19;
            int i24 = 881065984 * i16;
            int i25 = ((-991690752) * i11) + i24 + (1609302016 * i14) + ((-1236376205) * i23) + (i22 * (-1236376205)) + (i21 * (-1236376205)) + ((-212912869) * i12) + ((-1449289074) * i13) + 1954676736;
            int iC = a0.c(i11, -126594725, (1258674323 * i16) + i13 + i12 + i14);
            int i26 = i23 * 621;
            int i27 = i14 * (-1656160097);
            int i28 = i16 * (-2121497779);
            int i29 = i11 * 1378977669;
            int iE = a0.e(iC, -275906560, i29 + i28 + i27 + i26 + (i22 * 621) + (i21 * 621) + (i12 * (-1656161339)) + ((i13 * (-1656160718)) - 817430035), -372375552, ((-541982720) * iC) + i25);
            if (iE == 1) {
                int i31 = getSDKTransactionID;
                int i32 = i31 & 21;
                int i33 = ((i31 ^ 21) | i32) << 1;
                int i34 = -((i31 | 21) & (~i32));
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                getSDKReferenceNumber = i35 % 128;
                return Integer.valueOf(i35 % 2 != 0 ? 1 : 0);
            }
            if (iE != 2) {
                if (iE != 3) {
                    return getSDKTransactionID(objArr);
                }
                getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
                Set<ChallengeResultTimeout> set = (Set) objArr[1];
                int i36 = getSDKTransactionID;
                int i37 = i36 & 65;
                getSDKReferenceNumber = a0.d(i37, ~((i36 ^ 65) | i37), 1, 128);
                getsdkappid.getDeviceData = set;
                getSDKReferenceNumber = a0.d((i36 | 16) << 1, i36 ^ 16, 1, 128);
                return null;
            }
            getSDKAppID getsdkappid2 = (getSDKAppID) objArr[0];
            Parcel parcel = (Parcel) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i38 = getSDKReferenceNumber;
            int i39 = i38 & 75;
            int i41 = (i39 - (~((i38 ^ 75) | i39))) - 1;
            getSDKTransactionID = i41 % 128;
            if (i41 % 2 == 0) {
                super.writeToParcel(parcel, iIntValue);
                parcel.writeParcelableArray((ChallengeResultTimeout[]) getsdkappid2.getDeviceData.toArray(new ChallengeResultTimeout[0]), iIntValue);
            } else {
                super.writeToParcel(parcel, iIntValue);
                parcel.writeParcelableArray((ChallengeResultTimeout[]) getsdkappid2.getDeviceData.toArray(new ChallengeResultTimeout[0]), iIntValue);
            }
            return null;
        }

        private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            int i11 = getSDKTransactionID;
            int i12 = ((i11 | 89) << 1) - (i11 ^ 89);
            getSDKReferenceNumber = i12 % 128;
            int i13 = i12 % 2;
            Set<ChallengeResultTimeout> set = getsdkappid.getDeviceData;
            if (i13 != 0) {
                int i14 = 26 / 0;
            }
            return set;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final int describeContents() {
            int deviceData = atd.ar.getSDKReferenceNumber.getDeviceData();
            int deviceData2 = atd.ar.getSDKReferenceNumber.getDeviceData();
            int deviceData3 = atd.ar.getSDKReferenceNumber.getDeviceData();
            return ((Integer) AuthenticationRequestParameters(atd.ar.getSDKReferenceNumber.getDeviceData(), -2113250438, new Object[]{this}, 2113250439, deviceData2, deviceData, deviceData3)).intValue();
        }

        public final Set<ChallengeResultTimeout> getSDKReferenceNumber() {
            int deviceData = atd.ar.getSDKReferenceNumber.getDeviceData();
            int deviceData2 = atd.ar.getSDKReferenceNumber.getDeviceData();
            int deviceData3 = atd.ar.getSDKReferenceNumber.getDeviceData();
            return (Set) AuthenticationRequestParameters(atd.ar.getSDKReferenceNumber.getDeviceData(), 1435695435, new Object[]{this}, -1435695435, deviceData2, deviceData, deviceData3);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            Object[] objArr = {this, parcel, Integer.valueOf(i11)};
            int deviceData = atd.ar.getSDKReferenceNumber.getDeviceData();
            AuthenticationRequestParameters(atd.ar.getSDKReferenceNumber.getDeviceData(), -913119081, objArr, 913119083, atd.ar.getSDKReferenceNumber.getDeviceData(), deviceData, atd.ar.getSDKReferenceNumber.getDeviceData());
        }

        public getSDKAppID(Parcelable parcelable) {
            super(parcelable);
            this.getDeviceData = new LinkedHashSet();
        }

        public final void AuthenticationRequestParameters(Set<ChallengeResultTimeout> set) {
            int deviceData = atd.ar.getSDKReferenceNumber.getDeviceData();
            int deviceData2 = atd.ar.getSDKReferenceNumber.getDeviceData();
            int deviceData3 = atd.ar.getSDKReferenceNumber.getDeviceData();
            AuthenticationRequestParameters(atd.ar.getSDKReferenceNumber.getDeviceData(), 464848719, new Object[]{this, set}, -464848716, deviceData2, deviceData, deviceData3);
        }
    }

    private void getDeviceData(getAdditionalDetails getadditionaldetails) {
        List<ChallengeResultTimeout> listCompleted = getadditionaldetails.completed();
        ChallengeResult();
        this.getDeviceData.setAdapter((ListAdapter) new getSDKReferenceNumber(listCompleted) { // from class: atd.au.getSDKEphemeralPublicKey.2
            private static int getDeviceData = 0;
            private static int getSDKTransactionID = 1;

            @Override // atd.au.getSDKEphemeralPublicKey.getSDKReferenceNumber
            public final AuthenticationRequestParameters getSDKAppID(ViewGroup viewGroup) {
                getSDKTransactionID getsdktransactionid = getSDKEphemeralPublicKey.this.new getSDKTransactionID(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3ds2_view_multi_select_item, viewGroup, false));
                int i11 = getDeviceData;
                int i12 = i11 ^ 89;
                getSDKTransactionID = a0.d(((i11 & 89) | i12) << 1, ~(-i12), 1, 128);
                return getsdktransactionid;
            }
        });
        int i11 = ChallengeResult + 63;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // atd.au.getSDKReferenceNumber
    public final /* synthetic */ void getDeviceData(getTransactionStatus gettransactionstatus) {
        int deviceData = protocolError.getSDKTransactionID.getDeviceData();
        int deviceData2 = protocolError.getSDKTransactionID.getDeviceData();
        getSDKReferenceNumber(deviceData, protocolError.getSDKTransactionID.getDeviceData(), 1120330753, -1120330751, new Object[]{this, gettransactionstatus}, deviceData2, protocolError.getSDKTransactionID.getDeviceData());
    }

    private void getDeviceData(getSDKAppID getsdkappid) {
        int deviceData = protocolError.getSDKTransactionID.getDeviceData();
        int deviceData2 = protocolError.getSDKTransactionID.getDeviceData();
        getSDKReferenceNumber(deviceData, protocolError.getSDKTransactionID.getDeviceData(), -1123962739, 1123962739, new Object[]{this, getsdkappid}, deviceData2, protocolError.getSDKTransactionID.getDeviceData());
    }

    public final void getSDKTransactionID(ChallengeResultTimeout challengeResultTimeout) {
        int i11 = ChallengeResultCancelled + 21;
        ChallengeResult = i11 % 128;
        int i12 = i11 % 2;
        Set<ChallengeResultTimeout> set = this.AuthenticationRequestParameters;
        if (i12 != 0) {
            set.add(challengeResultTimeout);
        } else {
            set.add(challengeResultTimeout);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public final class getSDKTransactionID extends AuthenticationRequestParameters {
        private static int getDeviceData = 0;
        private static int getSDKReferenceNumber = 1;

        public getSDKTransactionID(View view) {
            super(view);
        }

        private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            CompoundButton compoundButton = (CompoundButton) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i11 = getSDKReferenceNumber;
            int i12 = (i11 ^ 9) + ((i11 & 9) << 1);
            getDeviceData = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) compoundButton.getTag();
            if (!zBooleanValue) {
                getSDKEphemeralPublicKey.this.getSDKReferenceNumber(challengeResultTimeout);
                int i13 = getSDKReferenceNumber;
                int i14 = i13 | 63;
                getDeviceData = ((i14 << 1) - ((~(i13 & 63)) & i14)) % 128;
                return null;
            }
            getSDKEphemeralPublicKey.this.getSDKTransactionID(challengeResultTimeout);
            int i15 = getDeviceData;
            int i16 = ((i15 | 45) << 1) - (i15 ^ 45);
            getSDKReferenceNumber = i16 % 128;
            if (i16 % 2 != 0) {
                return null;
            }
            throw null;
        }

        public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17 = ~i12;
            int i18 = ~i13;
            int i19 = (~(i17 | i18)) | (~(i17 | i14)) | (~(i18 | i14));
            int i21 = ~(i13 | i17);
            int i22 = i14 | i21 | (~(i18 | i12));
            int i23 = (-1326448640) * i15;
            int i24 = ((-877658112) * i16) + (2076180480 * i11) + i23 + (226096115 * i22) + ((-226096115) * i21) + (i19 * (-226096115)) + ((-1100352524) * i12) + ((-1552544754) * i14) + 1566572544;
            int iC = a0.c(i16, 1728320405, ((-393945980) * i11) + i14 + i12 + i15);
            return a0.e(iC, -1426456576, (i16 * 147979147) + ((i11 * 1574575612) + ((i15 * (-252835169)) + ((i22 * 493) + ((i21 * (-493)) + ((i19 * (-493)) + ((i12 * (-252834676)) + ((i14 * (-252835662)) + (-192251156)))))))), 2075787264, (214302720 * iC) + i24) != 1 ? AuthenticationRequestParameters(objArr) : getSDKAppID(objArr);
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            getSDKAppID(new Object[]{this, compoundButton, Boolean.valueOf(z11)}, ChallengeStatusReceiver.getDeviceData.AuthenticationRequestParameters(), -691461755, ChallengeStatusReceiver.getDeviceData.AuthenticationRequestParameters(), 691461755, ChallengeStatusReceiver.getDeviceData.AuthenticationRequestParameters(), ChallengeStatusReceiver.getDeviceData.AuthenticationRequestParameters());
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getSDKAppID(new Object[]{this, view}, ChallengeStatusReceiver.getDeviceData.AuthenticationRequestParameters(), 332656751, ChallengeStatusReceiver.getDeviceData.AuthenticationRequestParameters(), -332656750, ChallengeStatusReceiver.getDeviceData.AuthenticationRequestParameters(), ChallengeStatusReceiver.getDeviceData.AuthenticationRequestParameters());
        }

        private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
            boolean z11 = false;
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            int i11 = getDeviceData;
            int i12 = i11 & 25;
            int i13 = -(-(i11 | 25));
            int i14 = (i12 & i13) + (i13 | i12);
            getSDKReferenceNumber = i14 % 128;
            if (i14 % 2 != 0) {
                CompoundButton compoundButton = getsdktransactionid.getSDKTransactionID;
                if (compoundButton.isChecked()) {
                    int i15 = getSDKReferenceNumber;
                    int i16 = ((i15 ^ 21) | (i15 & 21)) << 1;
                    int i17 = -(((~i15) & 21) | (i15 & (-22)));
                    getDeviceData = ((i16 ^ i17) + ((i17 & i16) << 1)) % 128;
                } else {
                    getDeviceData = (getSDKReferenceNumber + 121) % 128;
                    z11 = true;
                }
                compoundButton.setChecked(z11);
                int i18 = getDeviceData;
                int i19 = ((i18 | 111) << 1) - (i18 ^ 111);
                getSDKReferenceNumber = i19 % 128;
                if (i19 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            getsdktransactionid.getSDKTransactionID.isChecked();
            throw null;
        }
    }

    @Override // atd.au.getSDKReferenceNumber
    public final /* synthetic */ void getSDKReferenceNumber(getTransactionStatus gettransactionstatus) throws Throwable {
        ChallengeResultCancelled = (ChallengeResult + 5) % 128;
        getSDKReferenceNumber((getAdditionalDetails) gettransactionstatus);
        int i11 = ChallengeResult + 91;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[0];
        Parcelable parcelable = (Parcelable) objArr[1];
        int i11 = ChallengeResultCancelled + 101;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            int deviceData = protocolError.getSDKTransactionID.getDeviceData();
            int deviceData2 = protocolError.getSDKTransactionID.getDeviceData();
            getSDKReferenceNumber(deviceData, protocolError.getSDKTransactionID.getDeviceData(), -1123962739, 1123962739, new Object[]{getsdkephemeralpublickey, (getSDKAppID) parcelable}, deviceData2, protocolError.getSDKTransactionID.getDeviceData());
            super.onRestoreInstanceState(parcelable);
            int i12 = 2 / 0;
            return null;
        }
        int deviceData3 = protocolError.getSDKTransactionID.getDeviceData();
        int deviceData4 = protocolError.getSDKTransactionID.getDeviceData();
        getSDKReferenceNumber(deviceData3, protocolError.getSDKTransactionID.getDeviceData(), -1123962739, 1123962739, new Object[]{getsdkephemeralpublickey, (getSDKAppID) parcelable}, deviceData4, protocolError.getSDKTransactionID.getDeviceData());
        super.onRestoreInstanceState(parcelable);
        return null;
    }

    @Override // atd.au.getSDKReferenceNumber
    public final int getSDKReferenceNumber() {
        int i11;
        int i12 = ChallengeResultCancelled + 25;
        int i13 = i12 % 128;
        ChallengeResult = i13;
        if (i12 % 2 == 0) {
            i11 = R.layout.a3ds2_view_challenge_select;
            int i14 = 58 / 0;
        } else {
            i11 = R.layout.a3ds2_view_challenge_select;
        }
        int i15 = i13 + 121;
        ChallengeResultCancelled = i15 % 128;
        if (i15 % 2 == 0) {
            return i11;
        }
        throw null;
    }

    private void getSDKReferenceNumber(getAdditionalDetails getadditionaldetails) throws Throwable {
        int i11 = ChallengeResultCancelled + 29;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = AnonymousClass4.getSDKTransactionID[getadditionaldetails.getSDKTransactionID().ordinal()];
            throw null;
        }
        int i13 = AnonymousClass4.getSDKTransactionID[getadditionaldetails.getSDKTransactionID().ordinal()];
        if (i13 == 1) {
            AuthenticationRequestParameters(getadditionaldetails);
        } else if (i13 == 2) {
            getDeviceData(getadditionaldetails);
        } else {
            Object[] objArr = new Object[1];
            b("ꪤ䭩캺⍮\ud9d6ꡦ濵털朰揍냒ｭ蚏䎮퇷툗勇矾斜剱퉎眎ꀊ跊", KeyEvent.getDeadChar(0, 0) + 23, objArr);
            String strIntern = ((String) objArr[0]).intern();
            atd.h.getSDKTransactionID sDKTransactionID = getadditionaldetails.getSDKTransactionID();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strIntern);
            sb2.append(sDKTransactionID);
            throw new RuntimeException(sb2.toString());
        }
        this.getSDKAppID.setText(getadditionaldetails.ChallengeResultKt());
        this.getSDKAppID.setOnClickListener(this);
        ChallengeResultCancelled = (ChallengeResult + 53) % 128;
    }

    public final void getSDKReferenceNumber(ChallengeResultTimeout challengeResultTimeout) {
        int i11 = ChallengeResultCancelled + 119;
        ChallengeResult = i11 % 128;
        int i12 = i11 % 2;
        Set<ChallengeResultTimeout> set = this.AuthenticationRequestParameters;
        if (i12 == 0) {
            set.remove(challengeResultTimeout);
            int i13 = 73 / 0;
        } else {
            set.remove(challengeResultTimeout);
        }
        int i14 = ChallengeResultCancelled + 57;
        ChallengeResult = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }
}
