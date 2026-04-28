package c4;

import android.view.autofill.AutofillManager;
import b5.m0;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f7023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f7024b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, m0 m0Var) {
        super(4);
        this.f7023a = dVar;
        this.f7024b = m0Var;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        d dVar = this.f7023a;
        dVar.f7030f.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        se.b bVar = dVar.f7025a;
        ((AutofillManager) bVar.f39010b).requestAutofill(dVar.f7027c, this.f7024b.f5866b, dVar.f7030f);
        return Unit.f26487a;
    }
}
