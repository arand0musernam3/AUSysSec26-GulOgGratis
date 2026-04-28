package ir;

import com.app.tgtg.model.remote.UserData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f24115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public UserData f24116k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f24118n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, x70.c cVar) {
        super(2, cVar);
        this.f24118n = hVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new e(this.f24118n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bf, code lost:
    
        if (kotlin.Unit.f26487a != r2) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[PHI: r3 r8 r9
      0x009d: PHI (r3v5 int) = (r3v3 int), (r3v6 int) binds: [B:22:0x0099, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r8v3 com.app.tgtg.model.remote.UserData) = (r8v1 com.app.tgtg.model.remote.UserData), (r8v4 com.app.tgtg.model.remote.UserData) binds: [B:22:0x0099, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r9v3 ir.h) = (r9v1 ir.h), (r9v4 ir.h) binds: [B:22:0x0099, B:12:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2 A[PHI: r3 r8 r9
      0x00c2: PHI (r3v7 int) = (r3v5 int), (r3v8 int) binds: [B:30:0x00be, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r8v5 com.app.tgtg.model.remote.UserData) = (r8v3 com.app.tgtg.model.remote.UserData), (r8v6 com.app.tgtg.model.remote.UserData) binds: [B:30:0x00be, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r9v5 ir.h) = (r9v3 ir.h), (r9v6 ir.h) binds: [B:30:0x00be, B:11:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da A[PHI: r3 r8 r9
      0x00da: PHI (r3v9 int) = (r3v7 int), (r3v10 int) binds: [B:33:0x00d6, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r8v7 com.app.tgtg.model.remote.UserData) = (r8v5 com.app.tgtg.model.remote.UserData), (r8v8 com.app.tgtg.model.remote.UserData) binds: [B:33:0x00d6, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r9v7 ir.h) = (r9v5 ir.h), (r9v8 ir.h) binds: [B:33:0x00d6, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2 A[PHI: r3 r8 r9
      0x00f2: PHI (r3v11 int) = (r3v9 int), (r3v13 int) binds: [B:36:0x00ee, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r8v9 com.app.tgtg.model.remote.UserData) = (r8v7 com.app.tgtg.model.remote.UserData), (r8v12 com.app.tgtg.model.remote.UserData) binds: [B:36:0x00ee, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r9v9 ir.h) = (r9v7 ir.h), (r9v13 ir.h) binds: [B:36:0x00ee, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
