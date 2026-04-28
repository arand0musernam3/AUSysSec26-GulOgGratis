package cj;

import f0.f2;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8165j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f8166k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f8169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f8170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f8171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f8172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8173s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(s0 s0Var, String str, ArrayList arrayList, ArrayList arrayList2, x70.c cVar) {
        super(2, cVar);
        this.f8171q = s0Var;
        this.f8169o = str;
        this.f8172r = arrayList;
        this.f8173s = arrayList2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8165j) {
            case 0:
                return new a0((String) this.l, (e0) this.f8171q, (String) this.f8169o, (String) this.f8173s, cVar);
            case 1:
                return new a0((s0) this.f8171q, (String) this.f8169o, (ArrayList) this.f8172r, (ArrayList) this.f8173s, cVar);
            default:
                a0 a0Var = new a0((f2) this.f8169o, (ok.f) this.f8173s, cVar);
                a0Var.l = obj;
                return a0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8165j) {
            case 0:
                return ((a0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((a0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((a0) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bc A[PHI: r0 r1 r3 r11
      0x02bc: PHI (r0v19 int) = (r0v17 int), (r0v21 int) binds: [B:105:0x02a0, B:110:0x02bb] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r1v9 com.app.tgtg.model.remote.manufacturer.response.FindAddressMatchResponse) = 
      (r1v6 com.app.tgtg.model.remote.manufacturer.response.FindAddressMatchResponse)
      (r1v13 com.app.tgtg.model.remote.manufacturer.response.FindAddressMatchResponse)
     binds: [B:105:0x02a0, B:110:0x02bb] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r3v5 java.lang.Object) = (r3v3 java.lang.Object), (r3v7 java.lang.Object) binds: [B:105:0x02a0, B:110:0x02bb] A[DONT_GENERATE, DONT_INLINE]
      0x02bc: PHI (r11v5 cj.e0) = (r11v2 cj.e0), (r11v6 cj.e0) binds: [B:105:0x02a0, B:110:0x02bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d8 A[PHI: r0
      0x02d8: PHI (r0v23 java.lang.Object) = (r0v12 java.lang.Object), (r0v20 java.lang.Object), (r0v29 java.lang.Object) binds: [B:99:0x027e, B:112:0x02d5, B:81:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027a A[PHI: r0
      0x027a: PHI (r0v12 java.lang.Object) = (r0v11 java.lang.Object), (r0v16 java.lang.Object) binds: [B:96:0x0276, B:84:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0081 -> B:25:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ae -> B:24:0x00af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f2 f2Var, ok.f fVar, x70.c cVar) {
        super(2, cVar);
        this.f8169o = f2Var;
        this.f8173s = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(String str, e0 e0Var, String str2, String str3, x70.c cVar) {
        super(2, cVar);
        this.l = str;
        this.f8171q = e0Var;
        this.f8169o = str2;
        this.f8173s = str3;
    }
}
