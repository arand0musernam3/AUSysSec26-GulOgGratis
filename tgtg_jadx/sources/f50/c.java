package f50;

import c50.k1;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Regex f17333h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f17334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u40.e f17335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c50.b f17336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f17337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f17338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e90.c f17339f;

    static {
        p80.c cVar = p80.d.f34559b;
        f17332g = (int) p80.d.j(p80.g.g(24, p80.h.HOURS), p80.h.SECONDS);
        f17333h = new Regex(ExpiryDateInput.SEPARATOR);
    }

    public c(k1 k1Var, u40.e eVar, c50.b bVar, e eVar2, o oVar) {
        k1Var.getClass();
        eVar.getClass();
        bVar.getClass();
        eVar2.getClass();
        oVar.getClass();
        this.f17334a = k1Var;
        this.f17335b = eVar;
        this.f17336c = bVar;
        this.f17337d = eVar2;
        this.f17338e = oVar;
        this.f17339f = e90.d.a();
    }

    @Override // f50.p
    public final Boolean a() {
        return this.f17338e.a().f17347a;
    }

    @Override // f50.p
    public final p80.d b() {
        Integer num = this.f17338e.a().f17349c;
        if (num == null) {
            return null;
        }
        p80.c cVar = p80.d.f34559b;
        return new p80.d(p80.g.g(num.intValue(), p80.h.SECONDS));
    }

    @Override // f50.p
    public final Double c() {
        return this.f17338e.a().f17348b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:44:0x00aa, B:46:0x00b4, B:49:0x00bf, B:52:0x014a, B:36:0x0085, B:38:0x008d, B:41:0x0098), top: B:60:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004d, B:44:0x00aa, B:46:0x00b4, B:49:0x00bf, B:52:0x014a, B:36:0x0085, B:38:0x008d, B:41:0x0098), top: B:60:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // f50.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(x70.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.c.d(x70.c):java.lang.Object");
    }
}
