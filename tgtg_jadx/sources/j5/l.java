package j5;

import i4.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Lambda implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f24636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f24637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f24638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f24639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f24640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f24641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f24642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f24643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f24644j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f24645k;
    public static final l l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l f24646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l f24647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l f24648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l f24649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l f24650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final l f24651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l f24652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f24653t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l f24654u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l f24655v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24656a;

    static {
        int i11 = 2;
        f24636b = new l(i11, 0);
        f24637c = new l(i11, 1);
        f24638d = new l(i11, 2);
        f24639e = new l(i11, 3);
        f24640f = new l(i11, 4);
        f24641g = new l(i11, 5);
        f24642h = new l(i11, 6);
        f24643i = new l(i11, 7);
        f24644j = new l(i11, 8);
        f24645k = new l(i11, 9);
        l = new l(i11, 10);
        f24646m = new l(i11, 11);
        f24647n = new l(i11, 12);
        f24648o = new l(i11, 13);
        f24649p = new l(i11, 14);
        f24650q = new l(i11, 15);
        f24651r = new l(i11, 16);
        f24652s = new l(i11, 17);
        f24653t = new l(i11, 18);
        f24654u = new l(i11, 19);
        f24655v = new l(i11, 20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i11, int i12) {
        super(i11);
        this.f24656a = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        u70.f fVar;
        switch (this.f24656a) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = n0.f26529a;
                }
                return CollectionsKt.d0(list, collection);
            case 1:
                return (c4.e) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 3:
                return (c4.o) obj;
            case 4:
                return (c4.g) obj;
            case 5:
                return (Unit) obj;
            case 6:
                return (Unit) obj;
            case 7:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 9:
                return (Unit) obj;
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 11:
                j jVar = (j) obj;
                int i11 = ((j) obj2).f24632a;
                return jVar;
            case 12:
                return (v0) obj;
            case 13:
                return (String) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                Float f11 = (Float) obj;
                ((Number) obj2).floatValue();
                return f11;
            case 16:
                return (String) obj;
            case 17:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 18:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f24609a) == null) {
                    str = aVar2.f24609a;
                }
                if (aVar == null || (fVar = aVar.f24610b) == null) {
                    fVar = aVar2.f24610b;
                }
                return new a(str, fVar);
            case 19:
                return obj == null ? obj2 : obj;
            default:
                Object objValueOf = Float.valueOf(0.0f);
                t tVar = (t) obj2;
                n nVar = ((t) obj).f24696d;
                a0 a0Var = x.f24725t;
                o oVar = o.f24687c;
                Object objD = nVar.f24682a.d(a0Var);
                if (objD == null) {
                    oVar.getClass();
                    objD = objValueOf;
                }
                float fFloatValue = ((Number) objD).floatValue();
                n nVar2 = tVar.f24696d;
                o oVar2 = o.f24688d;
                Object objD2 = nVar2.f24682a.d(a0Var);
                if (objD2 == null) {
                    oVar2.getClass();
                } else {
                    objValueOf = objD2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
