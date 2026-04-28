package kotlin.collections;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f26518k;
    public Iterator l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f26519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26520n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f26521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f26522p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f26523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f26524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Iterator f26525s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f26526t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f26527u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(int i11, int i12, Iterator it, boolean z11, boolean z12, x70.c cVar) {
        super(2, cVar);
        this.f26523q = i11;
        this.f26524r = i12;
        this.f26525s = it;
        this.f26526t = z11;
        this.f26527u = z12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        k1 k1Var = new k1(this.f26523q, this.f26524r, this.f26525s, this.f26526t, this.f26527u, cVar);
        k1Var.f26522p = obj;
        return k1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k1) create((o80.k) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        r19.f26522p = r1;
        r19.f26518k = r7;
        r19.l = r15;
        r19.f26519m = r6;
        r19.f26520n = r3;
        r19.f26521o = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (r1.a(r7, r19) != r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
    
        if (r1.a(r7, r19) == r2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0151, code lost:
    
        if (r1.a(r5, r19) == r2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0182, code lost:
    
        if (r1.a(r5, r19) == r2) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        if (r1.a(r7, r19) == r2) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a8 -> B:18:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0110 -> B:65:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0151 -> B:72:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0182 -> B:84:0x0185). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
