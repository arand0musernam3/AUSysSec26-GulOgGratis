package f6;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements p80.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17421c;

    public p(ub.a aVar) {
        this.f17419a = 5;
        Context context = (Context) aVar.f40981b;
        int iD = a40.g.d(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iD != 0) {
            this.f17420b = "Unity";
            String string = context.getResources().getString(iD);
            this.f17421c = string;
            String strK = e0.f.k("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strK, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f17420b = "Flutter";
                this.f17421c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f17420b = null;
        this.f17421c = null;
    }

    public j6.c a() {
        String str = this.f17420b;
        if (str != null) {
            return j6.g.j(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.f17421c + ". Using WrapContent.");
        return j6.g.j("wrap");
    }

    public boolean equals(Object obj) {
        switch (this.f17419a) {
            case 1:
                if (!(obj instanceof g7.a)) {
                    return false;
                }
                g7.a aVar = (g7.a) obj;
                Object obj2 = aVar.f20083a;
                String str = this.f17420b;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                Object obj3 = aVar.f20084b;
                String str2 = this.f17421c;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f17419a) {
            case 1:
                String str = this.f17420b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.f17421c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // p80.p
    public p80.l toInstant() {
        throw new p80.m(this.f17420b + " when parsing an Instant from \"" + p80.o.i(64, this.f17421c) + '\"');
    }

    public String toString() {
        switch (this.f17419a) {
            case 1:
                return "Pair{" + ((Object) this.f17420b) + " " + ((Object) this.f17421c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p(String str, String str2, int i11) {
        this.f17419a = i11;
        this.f17420b = str;
        this.f17421c = str2;
    }
}
