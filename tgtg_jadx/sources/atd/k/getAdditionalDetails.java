package atd.k;

import android.annotation.SuppressLint;
import android.app.Application;
import android.location.Location;
import android.location.LocationManager;
import atd.k.ChallengeResultCompleted;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\t*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;", "", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lkotlin/Function1;", "Landroid/location/Location;", "", "getField", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "getLocationField", "(Lkotlin/jvm/functions/Function1;)Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "", "isAnyLocationPermissionGranted", "()Z", "getLocationOrNull", "()Landroid/location/Location;", "Landroid/location/LocationManager;", "", "provider", "lastKnownLocation", "(Landroid/location/LocationManager;Ljava/lang/String;)Landroid/location/Location;", "", "getNewestOrFirst", "(Ljava/util/List;)Landroid/location/Location;", "Landroid/app/Application;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "location", "Landroid/location/Location;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Location.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/common/Location\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1#2:63\n1863#3,2:64\n2318#3,14:66\n*S KotlinDebug\n*F\n+ 1 Location.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/common/Location\n*L\n45#1:64,2\n60#1:66,14\n*E\n"})
public final class getAdditionalDetails {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;

    @NotNull
    private final PermissionChecker AuthenticationRequestParameters;

    @NotNull
    private final Application getDeviceData;

    @Nullable
    private final Location getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, short r6, short r7) {
        /*
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r0 = atd.k.getAdditionalDetails.$$a
            int r6 = r6 * 2
            int r6 = 99 - r6
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r6 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r5]
        L27:
            int r5 = r5 + 1
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.getAdditionalDetails.$$c(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKAppID = 7841625732549123005L;
    }

    private getAdditionalDetails(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        application.getClass();
        permissionChecker.getClass();
        this.getDeviceData = application;
        this.AuthenticationRequestParameters = permissionChecker;
        this.getSDKReferenceNumber = getSDKReferenceNumber();
    }

    @SuppressLint({"MissingPermission"})
    private static Location AuthenticationRequestParameters(LocationManager locationManager, String str) {
        int i11 = getSDKEphemeralPublicKey + 31;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return locationManager.getLastKnownLocation(str);
        }
        locationManager.getLastKnownLocation(str);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.getAdditionalDetails.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.location.Location getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r6 = this;
            android.app.Application r0 = r6.getDeviceData
            java.lang.String r1 = ""
            int r1 = android.text.TextUtils.getTrimmedLength(r1)
            int r1 = r1 + 18329
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "ȹ䖣贄퓿᱅柁꾬\uf714"
            a(r4, r1, r3)
            r1 = 0
            r1 = r3[r1]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.location.LocationManager
            r3 = 0
            if (r1 == 0) goto L36
            int r1 = atd.k.getAdditionalDetails.getSDKEphemeralPublicKey
            int r1 = r1 + 109
            int r4 = r1 % 128
            atd.k.getAdditionalDetails.getSDKTransactionID = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L33
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            goto L37
        L33:
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            throw r3
        L36:
            r0 = r3
        L37:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L74
            int r4 = atd.k.getAdditionalDetails.getSDKEphemeralPublicKey
            int r4 = r4 + 3
            int r5 = r4 % 128
            atd.k.getAdditionalDetails.getSDKTransactionID = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L51
            java.util.List r2 = r0.getProviders(r2)
            if (r2 == 0) goto L74
            goto L57
        L51:
            java.util.List r2 = r0.getProviders(r2)
            if (r2 == 0) goto L74
        L57:
            java.util.Iterator r2 = r2.iterator()
        L5b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            android.location.Location r4 = AuthenticationRequestParameters(r0, r4)
            if (r4 == 0) goto L5b
            r1.add(r4)
            goto L5b
        L74:
            int r0 = atd.k.getAdditionalDetails.getSDKEphemeralPublicKey
            int r0 = r0 + 103
            int r0 = r0 % 128
            atd.k.getAdditionalDetails.getSDKTransactionID = r0
        L7c:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L83
            return r3
        L83:
            android.location.Location r0 = getSDKTransactionID(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.getAdditionalDetails.getSDKReferenceNumber():android.location.Location");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
    
        if (r3.getSDKAppID(((java.lang.String) r4[0]).intern()) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        r0 = atd.k.getAdditionalDetails.getSDKTransactionID + 107;
        atd.k.getAdditionalDetails.getSDKEphemeralPublicKey = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007e, code lost:
    
        if ((r0 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0082, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        if (r3.getSDKAppID(((java.lang.String) r4[0]).intern()) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean getSDKTransactionID() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = atd.k.getAdditionalDetails.getSDKTransactionID
            int r0 = r0 + 11
            int r0 = r0 % 128
            atd.k.getAdditionalDetails.getSDKEphemeralPublicKey = r0
            com.adyen.threeds2.internal.deviceinfo.parameter.AuthenticationRequestParameters r0 = r6.AuthenticationRequestParameters
            java.lang.String r1 = ""
            r2 = 0
            int r1 = android.text.TextUtils.getOffsetAfter(r1, r2)
            r3 = 62533(0xf445, float:8.7627E-41)
            int r3 = r3 - r1
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = "ȴ\uf67e\ueabb\udee8팮읥뮯꾘ꀍ鑝袕糏焀斧姠刷䙪㪮⺡⌋ᝲி\ufffe\uf035\ue47e\ud8b7촔셝떘꧖ꈐ陋說综猰杹宠俸䀢㒙⣓"
            a(r5, r3, r4)
            r3 = r4[r2]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.intern()
            boolean r0 = r0.getSDKAppID(r3)
            if (r0 != 0) goto L83
            int r0 = atd.k.getAdditionalDetails.getSDKTransactionID
            int r0 = r0 + r1
            int r3 = r0 % 128
            atd.k.getAdditionalDetails.getSDKEphemeralPublicKey = r3
            int r0 = r0 % 2
            com.adyen.threeds2.internal.deviceinfo.parameter.AuthenticationRequestParameters r3 = r6.AuthenticationRequestParameters
            r4 = 62971(0xf5fb, float:8.8241E-41)
            java.lang.String r5 = "ȴ\uf7c0\ue9c7\ue3d6헖쿛쇓뮦귽\ua7e3駩鏱藸羙熜殉嶊垐䧝䎵㖊⾁ↂᮋඎމ省\uf365\ue56f\udf7f텠쭼뵺띍ꥂꍐ镐轝腙"
            if (r0 != 0) goto L59
            int r0 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r0 = r0 / 91
            int r0 = r4 >> r0
            java.lang.Object[] r4 = new java.lang.Object[r1]
            a(r5, r0, r4)
            r0 = r4[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r3.getSDKAppID(r0)
            if (r0 == 0) goto L74
            goto L83
        L59:
            int r0 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r0 = r0 >> 16
            int r0 = r0 + r4
            java.lang.Object[] r4 = new java.lang.Object[r1]
            a(r5, r0, r4)
            r0 = r4[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r3.getSDKAppID(r0)
            if (r0 == 0) goto L74
            goto L83
        L74:
            int r0 = atd.k.getAdditionalDetails.getSDKTransactionID
            int r0 = r0 + 107
            int r1 = r0 % 128
            atd.k.getAdditionalDetails.getSDKEphemeralPublicKey = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L81
            return r2
        L81:
            r0 = 0
            throw r0
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.getAdditionalDetails.getSDKTransactionID():boolean");
    }

    public static void init$0() {
        $$a = new byte[]{78, 97, 15, -120};
        $$b = 167;
    }

    public /* synthetic */ getAdditionalDetails(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    @NotNull
    public final ChallengeResultCompleted getSDKTransactionID(@NotNull Function1<? super Location, Double> function1) {
        ChallengeResultCompleted.getSDKReferenceNumber.C0008getSDKReferenceNumber c0008getSDKReferenceNumber;
        function1.getClass();
        if (getSDKTransactionID()) {
            Location location = this.getSDKReferenceNumber;
            return location != null ? new ChallengeResultCompleted.getDeviceData(((Number) function1.invoke(location)).doubleValue()) : ChallengeResultCompleted.getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters;
        }
        int i11 = getSDKTransactionID + 49;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            c0008getSDKReferenceNumber = ChallengeResultCompleted.getSDKReferenceNumber.C0008getSDKReferenceNumber.getSDKAppID;
            int i12 = 28 / 0;
        } else {
            c0008getSDKReferenceNumber = ChallengeResultCompleted.getSDKReferenceNumber.C0008getSDKReferenceNumber.getSDKAppID;
        }
        getSDKEphemeralPublicKey = (getSDKTransactionID + 77) % 128;
        return c0008getSDKReferenceNumber;
    }

    private static Location getSDKTransactionID(List<? extends Location> list) {
        getSDKTransactionID = (getSDKEphemeralPublicKey + 71) % 128;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                getSDKEphemeralPublicKey = (getSDKTransactionID + 41) % 128;
            } else {
                long elapsedRealtimeNanos = ((Location) next).getElapsedRealtimeNanos();
                do {
                    Object next2 = it.next();
                    long elapsedRealtimeNanos2 = ((Location) next2).getElapsedRealtimeNanos();
                    if (elapsedRealtimeNanos > elapsedRealtimeNanos2) {
                        getSDKTransactionID = (getSDKEphemeralPublicKey + 43) % 128;
                        next = next2;
                        elapsedRealtimeNanos = elapsedRealtimeNanos2;
                    }
                } while (it.hasNext());
                int i11 = getSDKTransactionID + 25;
                getSDKEphemeralPublicKey = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 89 / 0;
                }
            }
            return (Location) next;
        }
        i1.c();
        return null;
    }
}
