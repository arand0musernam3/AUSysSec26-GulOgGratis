package j0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends c5.b implements x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f24313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u uVar) {
        super(3, false);
        this.f24313c = uVar;
    }

    @Override // j0.x
    public final void a(Object obj) {
        Object obj2;
        s sVar;
        ((v80.q) this.f7114b).R(new b0(obj));
        u uVar = this.f24313c;
        r80.d dVar = uVar.f24324f;
        do {
            obj2 = dVar.f37785a;
            s sVar2 = (s) obj2;
            int i11 = t.$EnumSwitchMapping$0[sVar2.ordinal()];
            if (i11 == 1) {
                sVar = s.FRAME_INFO_COMPLETE;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("Unexpected frame state for " + uVar + "! State is " + sVar2 + ' ');
                }
                sVar = s.COMPLETE;
            }
        } while (!dVar.a(obj2, sVar));
        Iterator it = uVar.f24326h.iterator();
        it.getClass();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
        if (sVar == s.COMPLETE) {
            Iterator it2 = uVar.f24326h.iterator();
            it2.getClass();
            if (it2.hasNext()) {
                throw e0.f.e(it2);
            }
        }
    }
}
