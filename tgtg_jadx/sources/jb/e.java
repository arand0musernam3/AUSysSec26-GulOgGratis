package jb;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24881d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i11) {
        this.f24878a = i11;
        this.f24879b = obj;
        this.f24880c = obj2;
        this.f24881d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f24878a) {
            case 0:
                f fVar = (f) this.f24879b;
                ArrayList arrayList = (ArrayList) this.f24880c;
                String str = (String) this.f24881d;
                WorkDatabase workDatabase = fVar.f24887e;
                qb.y yVarY = workDatabase.y();
                yVarY.getClass();
                str.getClass();
                arrayList.addAll((List) x0.A(yVarY.f36875a, true, false, new qb.s(str, 8)));
                return workDatabase.x().e(str);
            default:
                return ((v30.f) this.f24879b).f41966a.submit(new v30.a(1, (Callable) this.f24880c, (m1.a) this.f24881d));
        }
    }
}
