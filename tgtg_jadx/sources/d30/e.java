package d30;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import i30.j;
import i30.n;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f14018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f14020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i30.c f14021d;

    public e(Context context, n nVar, b bVar) {
        String strEncodeToString;
        this.f14019b = context.getPackageName();
        this.f14018a = nVar;
        this.f14020c = bVar;
        n nVar2 = i30.d.f23216a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        byte[] byteArray = signature.toByteArray();
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.update(byteArray);
                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                        } catch (NoSuchAlgorithmException unused) {
                            strEncodeToString = "";
                        }
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                            String str = Build.TAGS;
                            if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                            }
                        }
                        this.f14021d = new i30.c(context, nVar, f.f14022a);
                        return;
                    }
                }
                n nVar3 = i30.d.f23216a;
                Object[] objArr = new Object[0];
                nVar3.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    Log.w("PlayCore", n.b(nVar3.f23225a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        Object[] objArr2 = new Object[0];
        nVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", n.b(nVar.f23225a, "Phonesky is not installed.", objArr2));
        }
        this.f14021d = null;
    }

    public static Bundle a(e eVar, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", eVar.f14019b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList<j> arrayList = new ArrayList();
        arrayList.add(new j(System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        for (j jVar : arrayList) {
            Bundle bundle2 = new Bundle();
            jVar.getClass();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", jVar.f23222a);
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
