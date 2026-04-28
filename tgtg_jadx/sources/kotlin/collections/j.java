package kotlin.collections;

import c5.l3;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26514b;

    public /* synthetic */ j(Object obj, int i11) {
        this.f26513a = i11;
        this.f26514b = obj;
    }

    @Override // kotlin.collections.a
    public final int b() {
        switch (this.f26513a) {
            case 0:
                return ((k) this.f26514b).d();
            case 1:
                return ((kotlin.text.l) this.f26514b).f26614a.groupCount() + 1;
            default:
                return ((r3.b) this.f26514b).f37579e;
        }
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f26513a) {
            case 0:
                return ((k) this.f26514b).containsValue(obj);
            case 1:
                if (obj == null ? true : obj instanceof MatchGroup) {
                    return super.contains((MatchGroup) obj);
                }
                return false;
            default:
                return ((r3.b) this.f26514b).containsValue(obj);
        }
    }

    public MatchGroup d(int i11) {
        Matcher matcher = ((kotlin.text.l) this.f26514b).f26614a;
        IntRange intRangeJ = n80.p.j(matcher.start(i11), matcher.end(i11));
        if (intRangeJ.f26553a < 0) {
            return null;
        }
        String strGroup = matcher.group(i11);
        strGroup.getClass();
        return new MatchGroup(strGroup, intRangeJ);
    }

    @Override // kotlin.collections.a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f26513a) {
            case 1:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f26513a) {
            case 0:
                return new h(((r3.j) ((k) this.f26514b).a()).iterator(), 1);
            case 1:
                return new h7.h0(o80.r.m(new l3(d0.f(this), 3), new jd.a(this, 13)));
            default:
                r3.l lVar = ((r3.b) this.f26514b).f37578d;
                r3.m[] mVarArr = new r3.m[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    mVarArr[i11] = new r3.n(2);
                }
                return new r3.k(lVar, mVarArr);
        }
    }
}
