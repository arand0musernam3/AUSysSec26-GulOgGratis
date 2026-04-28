package ax;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f5024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FacebookException f5026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n20.f f5017j = new n20.f(8);

    @NotNull
    public static final Parcelable.Creator<w> CREATOR = new a00.p0(28);

    public w(int i11, int i12, int i13, String str, String str2, String str3, String str4, Object obj, FacebookException facebookException, boolean z11) {
        Set set;
        Set set2;
        Set set3;
        v vVar;
        this.f5018a = i11;
        this.f5019b = i12;
        this.f5020c = i13;
        this.f5021d = str;
        this.f5022e = str3;
        this.f5023f = str4;
        this.f5024g = obj;
        this.f5025h = str2;
        n20.f fVar = f5017j;
        if (facebookException != null) {
            this.f5026i = facebookException;
            vVar = v.OTHER;
        } else {
            this.f5026i = new FacebookServiceException(this, a());
            tx.n nVarV = fVar.v();
            Map map = nVarV.f40533b;
            Map map2 = nVarV.f40534c;
            Map map3 = nVarV.f40532a;
            vVar = z11 ? v.TRANSIENT : (map3 != null && map3.containsKey(Integer.valueOf(i12)) && ((set3 = (Set) map3.get(Integer.valueOf(i12))) == null || set3.contains(Integer.valueOf(i13)))) ? v.OTHER : (map2 != null && map2.containsKey(Integer.valueOf(i12)) && ((set2 = (Set) map2.get(Integer.valueOf(i12))) == null || set2.contains(Integer.valueOf(i13)))) ? v.LOGIN_RECOVERABLE : (map != null && map.containsKey(Integer.valueOf(i12)) && ((set = (Set) map.get(Integer.valueOf(i12))) == null || set.contains(Integer.valueOf(i13)))) ? v.TRANSIENT : v.OTHER;
        }
        fVar.v().getClass();
        if (vVar == null) {
            return;
        }
        int i14 = tx.m.$EnumSwitchMapping$0[vVar.ordinal()];
    }

    public final String a() {
        String str = this.f5025h;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.f5026i;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "{HttpStatus: " + this.f5018a + ", errorCode: " + this.f5019b + ", subErrorCode: " + this.f5020c + ", errorType: " + this.f5021d + ", errorMessage: " + a() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f5018a);
        parcel.writeInt(this.f5019b);
        parcel.writeInt(this.f5020c);
        parcel.writeString(this.f5021d);
        parcel.writeString(a());
        parcel.writeString(this.f5022e);
        parcel.writeString(this.f5023f);
    }

    public w(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public w(int i11, String str, String str2) {
        this(-1, i11, -1, str, str2, null, null, null, null, false);
    }
}
