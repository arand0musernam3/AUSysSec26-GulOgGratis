package ic;

import p80.g;
import p80.h;
import p80.l;
import p80.m;
import p80.o;
import p80.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23777b;

    public b() {
        long jF = g.f(1.5d, h.SECONDS);
        this.f23777b = 4;
        this.f23776a = jF;
    }

    public static b a(int i11, int i12, String str) {
        if (i11 >= i12) {
            return null;
        }
        long j9 = 0;
        int i13 = i11;
        while (i13 < i12) {
            char cCharAt = str.charAt(i13);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j9 = (j9 * 10) + ((long) (cCharAt - '0'));
            if (j9 > 2147483647L) {
                return null;
            }
            i13++;
        }
        if (i13 == i11) {
            return null;
        }
        return new b(j9, i13);
    }

    @Override // p80.p
    public l toInstant() {
        long j9 = l.f34565c.f34567a;
        long j11 = this.f23776a;
        if (j11 >= j9 && j11 <= l.f34566d.f34567a) {
            return o.c(this.f23777b, j11);
        }
        throw new m("The parsed date is outside the range representable by Instant (Unix epoch second " + j11 + ')');
    }

    public /* synthetic */ b(long j9, int i11) {
        this.f23776a = j9;
        this.f23777b = i11;
    }
}
