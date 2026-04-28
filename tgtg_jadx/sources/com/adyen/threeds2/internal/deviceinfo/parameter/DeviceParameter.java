package com.adyen.threeds2.internal.deviceinfo.parameter;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.adyen.threeds2.internal.deviceinfo.parameter.getDeviceData, reason: from Kotlin metadata */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0005H$¨\u0006\u000f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "", "<init>", "()V", "get", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "handleEmptyString", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "handleEmptyString-_vZncUs", "(Ljava/lang/String;)Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "handleEmptyList", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringsListValue;", "handleEmptyList-oLfF5qA", "(Ljava/util/List;)Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceParameter.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n774#2:32\n865#2,2:33\n*S KotlinDebug\n*F\n+ 1 DeviceParameter.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter\n*L\n25#1:32\n25#1:33,2\n*E\n"})
public abstract class DeviceParameter {
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r5, byte r6, short r7) {
        /*
            byte[] r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter.$$c
            int r6 = r6 * 2
            int r6 = r6 + 98
            int r5 = r5 * 3
            int r5 = r5 + 4
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L26:
            r3 = r0[r5]
        L28:
            int r3 = -r3
            int r6 = r6 + r3
            int r5 = r5 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter.$$g(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        getDeviceData = 711855274;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[PHI: r1
      0x003b: PHI (r1v9 java.lang.Object) = (r1v7 java.lang.Object), (r1v10 java.lang.Object) binds: [B:11:0x0038, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult AuthenticationRequestParameters(java.util.List<? extends java.lang.String> r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L4a
            int r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter.getSDKTransactionID
            r2 = 1
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter.getSDKAppID = r3
            int r1 = r1 % 2
            r3 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r6.next()
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.StringsKt.H(r4)
            r5 = 20
            int r5 = r5 / r3
            if (r4 != 0) goto L3b
            goto L3c
        L2d:
            java.lang.Object r1 = r6.next()
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = kotlin.text.StringsKt.H(r4)
            if (r4 != 0) goto L3b
            goto L3c
        L3b:
            r2 = r3
        L3c:
            if (r2 == 0) goto L9
            int r2 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter.getSDKAppID
            int r2 = r2 + 45
            int r2 = r2 % 128
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter.getSDKTransactionID = r2
            r0.add(r1)
            goto L9
        L4a:
            boolean r6 = r0.isEmpty()
            r1 = 0
            if (r6 != 0) goto L56
            java.util.List r6 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m172constructorimpl(r0)
            goto L57
        L56:
            r6 = r1
        L57:
            if (r6 == 0) goto L5e
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringsListValue r6 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m171boximpl(r6)
            goto L5f
        L5e:
            r6 = r1
        L5f:
            if (r6 == 0) goto L65
            java.util.List r1 = r6.m177unboximpl()
        L65:
            if (r1 == 0) goto L6c
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringsListValue r6 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m171boximpl(r1)
            return r6
        L6c:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r6 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter.AuthenticationRequestParameters(java.util.List):com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(boolean r23, int r24, java.lang.String r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$c = new byte[]{76, -58, -49, 5};
        $$f = 100;
    }

    @NotNull
    public final DeviceParameterResult getDeviceData() {
        getSDKTransactionID = (getSDKAppID + 15) % 128;
        try {
            DeviceParameterResult sDKReferenceNumber = getSDKReferenceNumber();
            if (sDKReferenceNumber instanceof DeviceParameterResult.Success.StringValue) {
                getSDKTransactionID = (getSDKAppID + 89) % 128;
                return getDeviceData(((DeviceParameterResult.Success.StringValue) sDKReferenceNumber).m170unboximpl());
            }
            Object[] objArr = new Object[1];
            a(true, 208 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\t\ufffe\ufff3\u0011\u0010\u0006￩\u0010\u0004\u000b\u0006\u000f\u0011\ufff0\uffc1\u0010\u0010\u0002\u0000\u0000\u0012\ufff0\uffc1\u0011\t\u0012\u0010\u0002\uffef\u000f\u0002\u0011\u0002\n\ufffe\u000f\ufffe￭\u0002\u0000\u0006\u0013\u0002￡ￋ\u000f\u0002\u0011\u0002\n\ufffe\u000f\ufffe\rￋ\f\u0003\u000b\u0006\u0002\u0000\u0006\u0013\u0002\u0001ￋ\t\ufffe\u000b\u000f\u0002\u0011\u000b\u0006ￋￏ\u0010\u0001\u0002\u0002\u000f\u0005\u0011ￋ\u000b\u0002\u0016\u0001\ufffeￋ\n\f\u0000\u0002\u0012", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 92, TextUtils.lastIndexOf("", '0', 0) + 96, objArr);
            if (!Class.forName(((String) objArr[0]).intern()).isInstance(sDKReferenceNumber)) {
                return sDKReferenceNumber;
            }
            getSDKAppID = (getSDKTransactionID + 63) % 128;
            return AuthenticationRequestParameters(((DeviceParameterResult.Success.StringsListValue) sDKReferenceNumber).m177unboximpl());
        } catch (Throwable unused) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
    }

    @NotNull
    public abstract DeviceParameterResult getSDKReferenceNumber();

    private static DeviceParameterResult getDeviceData(String str) {
        getSDKAppID = (getSDKTransactionID + 121) % 128;
        if (StringsKt.H(str)) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i11 = (getSDKTransactionID + 93) % 128;
        getSDKAppID = i11;
        getSDKTransactionID = (i11 + 47) % 128;
        return DeviceParameterResult.Success.StringValue.m164boximpl(str);
    }
}
