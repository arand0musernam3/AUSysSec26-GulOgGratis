package nf;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import of.l;
import tf.j;
import ye.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ye.b f30822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ye.b bVar, int i11) {
        super(0);
        this.f30821a = i11;
        this.f30822b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30821a) {
            case 0:
                ye.b bVar = this.f30822b;
                g gVar = bVar.f45852a;
                return new l(gVar.f45886a, gVar.f45894i, gVar.f45890e, gVar.a(), bVar.f(), bVar.f45854c, bVar.f45856e, bVar.f45857f, (tf.c) bVar.f45866p.getValue(), new ub.a(gVar, bVar.f()), new ky.b(gVar.f45887b, 7), gVar.f45903s);
            case 1:
                ye.b bVar2 = this.f30822b;
                return bVar2.f45852a.f45892g.v(bVar2);
            case 2:
                ye.b bVar3 = this.f30822b;
                g gVar2 = bVar3.f45852a;
                return new j(gVar2.f45886a, gVar2.f45894i, bVar3.f45854c, bVar3.f45856e, bVar3.f45857f, bVar3.g(), new ub.a(gVar2, bVar3.f()), bVar3.f());
            default:
                ye.b bVar4 = this.f30822b;
                return bVar4.f45852a.f45891f.e(bVar4);
        }
    }
}
