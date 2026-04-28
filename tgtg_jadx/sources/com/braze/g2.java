package com.braze;

import com.braze.enums.Month;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9848d;

    public /* synthetic */ g2(int i11, Month month, int i12) {
        this.f9845a = 0;
        this.f9846b = i11;
        this.f9848d = month;
        this.f9847c = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        switch (this.f9845a) {
            case 0:
                break;
            case 1:
                f2.s sVarJ = ((f2.c0) this.f9848d).j();
                int i11 = (sVarJ.l + sVarJ.f17193m) / 2;
                Iterator it = sVarJ.f17192k.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    if (it.hasNext()) {
                        f2.t tVar = (f2.t) ((f2.m) next);
                        int iAbs = Math.abs(((tVar.f17214q / 2) + tVar.f17213p) - i11);
                        do {
                            Object next2 = it.next();
                            f2.t tVar2 = (f2.t) ((f2.m) next2);
                            int iAbs2 = Math.abs(((tVar2.f17214q / 2) + tVar2.f17213p) - i11);
                            if (iAbs > iAbs2) {
                                next = next2;
                                iAbs = iAbs2;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                f2.m mVar = (f2.m) obj;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                ((Function2) this.f9848d).invoke(Integer.valueOf(this.f9846b), Integer.valueOf(this.f9847c));
                break;
            default:
                x90.n nVar = (x90.n) this.f9848d;
                try {
                    nVar.f44153w.t(this.f9846b, this.f9847c, true);
                } catch (IOException e5) {
                    x90.b bVar = x90.b.PROTOCOL_ERROR;
                    nVar.a(bVar, bVar, e5);
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ g2(Object obj, int i11, int i12, int i13) {
        this.f9845a = i13;
        this.f9848d = obj;
        this.f9846b = i11;
        this.f9847c = i12;
    }
}
