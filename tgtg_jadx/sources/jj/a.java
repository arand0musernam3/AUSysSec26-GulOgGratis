package jj;

import b4.t;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f25285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f25286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f25287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f25288e;

    public /* synthetic */ a(List list, Set set, Function1 function1, t tVar, int i11, int i12) {
        this.f25284a = i12;
        this.f25285b = list;
        this.f25286c = set;
        this.f25287d = function1;
        this.f25288e = tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25284a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = i.F(1);
                b.a(this.f25285b, this.f25286c, this.f25287d, this.f25288e, (n) obj, iF);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF2 = i.F(1);
                w.e(this.f25285b, this.f25286c, this.f25287d, this.f25288e, (n) obj, iF2);
                break;
        }
        return Unit.f26487a;
    }
}
