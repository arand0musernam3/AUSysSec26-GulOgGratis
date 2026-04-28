package lo;

import android.app.ActivityOptions;
import android.content.Intent;
import androidx.lifecycle.m1;
import b0.a1;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.feature.rating.RatingActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManufacturerOrderActivity f27955b;

    public /* synthetic */ b(ManufacturerOrderActivity manufacturerOrderActivity, int i11) {
        this.f27954a = i11;
        this.f27955b = manufacturerOrderActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f27954a;
        boolean z11 = false;
        Object[] objArr = 0;
        x70.c cVar = null;
        ManufacturerOrderActivity manufacturerOrderActivity = this.f27955b;
        switch (i11) {
            case 0:
                String str = (String) obj;
                int i12 = ManufacturerOrderActivity.f9167q;
                str.getClass();
                m mVarF0 = manufacturerOrderActivity.f0();
                mVarF0.getClass();
                f0.B(m1.d(mVarF0), null, null, new al.n(mVarF0, str, cVar, 26), 3);
                return Unit.f26487a;
            case 1:
                int i13 = ManufacturerOrderActivity.f9167q;
                m mVarF02 = manufacturerOrderActivity.f0();
                mVarF02.getClass();
                f0.B(m1.d(mVarF02), null, null, new l(mVarF02, cVar, objArr == true ? 1 : 0), 3);
                return Unit.f26487a;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                int i14 = ManufacturerOrderActivity.f9167q;
                f0.B(m1.c(manufacturerOrderActivity), null, null, new a1(manufacturerOrderActivity, iIntValue, cVar, 6), 3);
                return Unit.f26487a;
            default:
                f70.h hVar = (f70.h) obj;
                int i15 = ManufacturerOrderActivity.f9167q;
                hVar.getClass();
                if (hVar instanceof ko.a) {
                    Intent intent = new Intent(manufacturerOrderActivity, (Class<?>) RatingActivity.class);
                    ko.a aVar = (ko.a) hVar;
                    intent.putExtra("ORDER", aVar.f26481a);
                    intent.putExtra("RATING", aVar.f26482b);
                    intent.putExtra("SOURCE", aVar.f26483c);
                    manufacturerOrderActivity.f9177p.a(intent, new se.b(ActivityOptions.makeCustomAnimation(manufacturerOrderActivity, R.anim.slide_in_from_bottom_to_top, R.anim.stay), 5));
                    z11 = true;
                }
                return Boolean.valueOf(z11);
        }
    }
}
