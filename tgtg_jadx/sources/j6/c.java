package j6;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f24740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24741b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f24742c = LongCompanionObject.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f24743d;

    public c(char[] cArr) {
        this.f24740a = cArr;
    }

    @Override // 
    /* JADX INFO: renamed from: b */
    public c clone() {
        try {
            return (c) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String c() {
        String str = new String(this.f24740a);
        if (str.length() < 1) {
            return "";
        }
        long j9 = this.f24742c;
        if (j9 != LongCompanionObject.MAX_VALUE) {
            long j11 = this.f24741b;
            if (j9 >= j11) {
                return str.substring((int) j11, ((int) j9) + 1);
            }
        }
        long j12 = this.f24741b;
        return str.substring((int) j12, ((int) j12) + 1);
    }

    public float d() {
        if (this instanceof e) {
            return ((e) this).d();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f24741b == cVar.f24741b && this.f24742c == cVar.f24742c && Arrays.equals(this.f24740a, cVar.f24740a)) {
            return Objects.equals(this.f24743d, cVar.f24743d);
        }
        return false;
    }

    public int h() {
        if (this instanceof e) {
            return ((e) this).h();
        }
        return 0;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f24740a) * 31;
        long j9 = this.f24741b;
        int i11 = (iHashCode + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j11 = this.f24742c;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        b bVar = this.f24743d;
        return (i12 + (bVar != null ? bVar.hashCode() : 0)) * 31;
    }

    public final String i() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    public String toString() {
        long j9 = this.f24741b;
        long j11 = this.f24742c;
        if (j9 > j11 || j11 == LongCompanionObject.MAX_VALUE) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass());
            sb2.append(" (INVALID, ");
            sb2.append(this.f24741b);
            sb2.append("-");
            return a0.j(this.f24742c, ")", sb2);
        }
        return i() + " (" + this.f24741b + " : " + this.f24742c + ") <<" + new String(this.f24740a).substring((int) this.f24741b, ((int) this.f24742c) + 1) + ">>";
    }
}
