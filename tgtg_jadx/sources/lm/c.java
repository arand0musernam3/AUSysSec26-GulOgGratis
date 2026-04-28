package lm;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0;
import androidx.viewpager2.widget.ViewPager2;
import com.app.tgtg.customview.SearchAndFilterView;
import com.app.tgtg.feature.locationpicker.newlocationpicker.NewLocationPicker;
import com.app.tgtg.feature.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mv.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f27908b;

    public /* synthetic */ c(i iVar, int i11) {
        this.f27907a = i11;
        this.f27908b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27907a) {
            case 0:
                i iVar = this.f27908b;
                pg.b bVar = iVar.f27926p;
                bVar.getClass();
                int currentItem = ((ViewPager2) bVar.f34783d).getCurrentItem();
                mm.a aVar = iVar.f27923m;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
                    aVar = null;
                }
                Fragment fragmentI = aVar.i(currentItem);
                nm.e eVar = fragmentI instanceof nm.e ? (nm.e) fragmentI : null;
                if (eVar != null) {
                    eVar.w();
                    pg.b bVar2 = iVar.f27926p;
                    bVar2.getClass();
                    TextView textView = (TextView) ((mc.a) bVar2.f34789j).f29924d;
                    iVar.t().f47948a.getClass();
                    textView.setText(iVar.getString(ft.b.a().getSortOption().getNameRes()));
                }
                break;
            case 1:
                MainActivity.f9078v = true;
                this.f27908b.w(false);
                break;
            case 2:
                this.f27908b.x();
                break;
            case 3:
                i iVar2 = this.f27908b;
                if (iVar2.s().f40311f.d()) {
                    pg.b bVar3 = iVar2.f27926p;
                    bVar3.getClass();
                    ((NewLocationPicker) bVar3.f34787h).setVisibility(0);
                    pg.b bVar4 = iVar2.f27926p;
                    bVar4.getClass();
                    NewLocationPicker newLocationPicker = (NewLocationPicker) bVar4.f34787h;
                    newLocationPicker.setOpenedFrom(dv.d.BROWSE.a());
                    newLocationPicker.setShowSheet(true);
                    newLocationPicker.setOnApplyChangesClicked(new c(iVar2, 1));
                } else {
                    iVar2.s().f40316k.c(f70.i.BROWSE);
                }
                break;
            default:
                i iVar3 = this.f27908b;
                o0 o0VarRequireActivity = iVar3.requireActivity();
                o0VarRequireActivity.getClass();
                r0.p(o0VarRequireActivity);
                pg.b bVar5 = iVar3.f27926p;
                bVar5.getClass();
                ((SearchAndFilterView) bVar5.f34788i).k(false);
                iVar3.t().f47948a.getClass();
                ft.b.a().setSearchText("");
                iVar3.w(true);
                break;
        }
        return Unit.f26487a;
    }
}
