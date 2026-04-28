package atd.o;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0004J\b\u0010\u0013\u001a\u00020\u0012H\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BluetoothDeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "application", "Landroid/app/Application;", "permissionChecker", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "bluetoothManager", "Landroid/bluetooth/BluetoothManager;", "getBluetoothManager", "()Landroid/bluetooth/BluetoothManager;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "getAdapter", "isBluetoothPermissionGranted", "", "isLocalMacAddressPermissionGranted", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getSDKReferenceNumber extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static long getSDKTransactionID;

    @Nullable
    private final BluetoothAdapter getDeviceData;

    @NotNull
    private final Application getSDKAppID;

    @NotNull
    private final PermissionChecker getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r5, byte r6, short r7) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r5 = r5 * 3
            int r0 = 1 - r5
            byte[] r1 = atd.o.getSDKReferenceNumber.$$a
            int r6 = r6 * 4
            int r6 = r6 + 120
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.o.getSDKReferenceNumber.$$d(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        BuildConfig = 1;
        getSDKTransactionID = -7456703145614032879L;
    }

    public getSDKReferenceNumber(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        application.getClass();
        permissionChecker.getClass();
        this.getSDKAppID = application;
        this.getSDKReferenceNumber = permissionChecker;
        this.getDeviceData = getSDKAppID();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(java.lang.String r19, int r20, java.lang.Object[] r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.o.getSDKReferenceNumber.b(java.lang.String, int, java.lang.Object[]):void");
    }

    private final BluetoothAdapter getSDKAppID() throws Throwable {
        AuthenticationRequestParameters = (BuildConfig + 21) % 128;
        BluetoothManager bluetoothManagerAuthenticationRequestParameters = AuthenticationRequestParameters();
        if (bluetoothManagerAuthenticationRequestParameters == null) {
            return null;
        }
        int i11 = AuthenticationRequestParameters + 17;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            return bluetoothManagerAuthenticationRequestParameters.getAdapter();
        }
        bluetoothManagerAuthenticationRequestParameters.getAdapter();
        throw null;
    }

    public static void init$0() {
        $$a = new byte[]{26, -23, -33, 87};
        $$b = 239;
    }

    @Nullable
    public final BluetoothManager AuthenticationRequestParameters() throws Throwable {
        Application application = this.getSDKAppID;
        Object[] objArr = new Object[1];
        b("阬݅陎쇪쎜㗥乯應赔\ue6e5\ue692\u0ee8ꁜ", 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (!(systemService instanceof BluetoothManager)) {
            AuthenticationRequestParameters = (BuildConfig + 85) % 128;
            return null;
        }
        int i11 = BuildConfig + 43;
        AuthenticationRequestParameters = i11 % 128;
        BluetoothManager bluetoothManager = (BluetoothManager) systemService;
        if (i11 % 2 == 0) {
            return bluetoothManager;
        }
        throw null;
    }

    public final boolean ChallengeResultCancelled() throws Throwable {
        Object obj;
        int i11 = AuthenticationRequestParameters + 15;
        BuildConfig = i11 % 128;
        int i12 = i11 % 2;
        PermissionChecker permissionChecker = this.getSDKReferenceNumber;
        if (i12 == 0) {
            Object[] objArr = new Object[1];
            b("\ue307\u0e60\ue366죍뒜ﻩ㥾\uaad2\uf864\uefc6醈얩핯\uf2de朗⃞뉊᧴\ue7a7࿖轘㳽샦櫧摴䏜ⷽ焛䄐朦ᛱ尀希訶珠묋㬵鄆峋蘨", 1 - Color.red(0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            b("\ue307\u0e60\ue366죍뒜ﻩ㥾\uaad2\uf864\uefc6醈얩핯\uf2de朗⃞뉊᧴\ue7a7࿖轘㳽샦櫧摴䏜ⷽ焛䄐朦ᛱ尀希訶珠묋㬵鄆峋蘨", 1 - Color.red(0), objArr2);
            obj = objArr2[0];
        }
        boolean sDKAppID = permissionChecker.getSDKAppID(((String) obj).intern());
        int i13 = BuildConfig + 29;
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 6 / 0;
        }
        return sDKAppID;
    }

    public final boolean getMessageVersion() throws Throwable {
        BuildConfig = (AuthenticationRequestParameters + 61) % 128;
        int i11 = Build.VERSION.SDK_INT;
        PermissionChecker permissionChecker = this.getSDKReferenceNumber;
        if (i11 >= 31) {
            Object[] objArr = new Object[1];
            b("\uf82e\uf2f4\uf84f㑙ৌ\ue50a萮넱\ue34dፒⳘ\ude4a칆๊䟂㬽ꥣ\ue560嫷ᐵ鑱쁩綶焊罞뽞邩櫠娩鮰ꮴ䟨䔥皠캻ꃢ\u2000涒\ue18b鷌", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, objArr);
            boolean sDKAppID = permissionChecker.getSDKAppID(((String) objArr[0]).intern());
            int i12 = BuildConfig + 117;
            AuthenticationRequestParameters = i12 % 128;
            if (i12 % 2 == 0) {
                return sDKAppID;
            }
            throw null;
        }
        Object[] objArr2 = new Object[1];
        b("뻖ꅫ뺷柆㘏橭믭㹖ꖵ䃍ጛ儭袾巕码둚\uef9b뛿攴魒튉鏶䉵\ufe6d㦦\uecc1꽪\ue587᳑젯鑷좏", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
        boolean sDKAppID2 = permissionChecker.getSDKAppID(((String) objArr2[0]).intern());
        int i13 = BuildConfig + 83;
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 == 0) {
            return sDKAppID2;
        }
        throw null;
    }

    @Nullable
    public final BluetoothAdapter getSDKEphemeralPublicKey() {
        int i11 = AuthenticationRequestParameters;
        BluetoothAdapter bluetoothAdapter = this.getDeviceData;
        BuildConfig = (i11 + 119) % 128;
        return bluetoothAdapter;
    }

    public /* synthetic */ getSDKReferenceNumber(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }
}
