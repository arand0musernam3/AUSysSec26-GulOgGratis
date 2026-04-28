package of;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.g1;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32496j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ double f32497k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(double d3, g1 g1Var, x70.c cVar) {
        super(2, cVar);
        this.f32497k = d3;
        this.l = g1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f32496j) {
            case 0:
                return new j((l) this.l, this.f32497k, cVar);
            default:
                return new j(this.f32497k, (g1) this.l, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f32496j) {
        }
        return ((j) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        StringBuilder sb2;
        int i11 = this.f32496j;
        Object obj2 = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                l lVar = (l) obj2;
                final v vVar = lVar.f32509j;
                kf.b bVar = vVar.f32534c;
                File file = new File(new File(vVar.f32532a, "com.amplitude.diagnostics"), vVar.f32537f);
                if (file.exists() && file.isDirectory()) {
                    arrayList = new ArrayList();
                    File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: of.q
                        @Override // java.io.FileFilter
                        public final boolean accept(File file2) {
                            v vVar2 = vVar;
                            vVar2.getClass();
                            return file2.isDirectory() && !Intrinsics.areEqual(file2.getName(), vVar2.f32533b);
                        }
                    });
                    if (fileArrListFiles == null) {
                        fileArrListFiles = new File[0];
                    }
                    File[] fileArr = fileArrListFiles;
                    int length = fileArr.length;
                    for (int i12 = 0; i12 < length; i12++) {
                        File file2 = fileArr[i12];
                        try {
                            try {
                                file2.getClass();
                                p pVarD = vVar.d(file2);
                                if (pVarD != null) {
                                    arrayList.add(pVarD);
                                }
                                try {
                                    v.c(file2);
                                } catch (Exception e5) {
                                    e = e5;
                                    sb2 = new StringBuilder("DiagnosticsStorage: Failed to delete session directory ");
                                    sb2.append(file2.getName());
                                    sb2.append(": ");
                                    sb2.append(e.getMessage());
                                    bVar.a(sb2.toString());
                                }
                            } catch (Exception e11) {
                                bVar.a("DiagnosticsStorage: Failed to load previous session " + file2.getName() + ": " + e11.getMessage());
                                try {
                                    v.c(file2);
                                } catch (Exception e12) {
                                    e = e12;
                                    sb2 = new StringBuilder("DiagnosticsStorage: Failed to delete session directory ");
                                    sb2.append(file2.getName());
                                    sb2.append(": ");
                                    sb2.append(e.getMessage());
                                    bVar.a(sb2.toString());
                                }
                            }
                        } finally {
                        }
                    }
                } else {
                    arrayList = n0.f26529a;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f0.B(lVar.f32503d, lVar.f32504e, null, new i(lVar, (p) it.next(), this.f32497k, null, 1), 2);
                }
                return Unit.f26487a;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((g1) obj2).i((float) this.f32497k);
                return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, double d3, x70.c cVar) {
        super(2, cVar);
        this.l = lVar;
        this.f32497k = d3;
    }
}
