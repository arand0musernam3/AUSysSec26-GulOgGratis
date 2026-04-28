package dk;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.n2;
import androidx.recyclerview.widget.y1;
import ax.s;
import bg.w0;
import c1.q;
import com.app.tgtg.R;
import com.app.tgtg.feature.flashsales.list.FlashSalesListActivity;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import fd.t;
import fd.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.j;
import mv.a0;
import mv.e0;
import mv.r0;
import td.k;
import w.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlashSalesListActivity f14949b;

    public /* synthetic */ a(FlashSalesListActivity flashSalesListActivity, int i11) {
        this.f14948a = i11;
        this.f14949b = flashSalesListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String iconUrl;
        int i11 = this.f14948a;
        pg.a aVar = null;
        final FlashSalesListActivity flashSalesListActivity = this.f14949b;
        switch (i11) {
            case 0:
                int i12 = FlashSalesListActivity.f8995p;
                ((View) obj).getClass();
                flashSalesListActivity.getOnBackPressedDispatcher().d();
                break;
            case 1:
                cv.e eVar = (cv.e) obj;
                int i13 = FlashSalesListActivity.f8995p;
                eVar.getClass();
                ((f) flashSalesListActivity.f8998h.getValue()).f14957b.a(eVar);
                break;
            case 2:
                DiscoverBucket discoverBucket = (DiscoverBucket) obj;
                if (discoverBucket != null) {
                    flashSalesListActivity.f9002m = discoverBucket;
                    discoverBucket.getDisplayType();
                    pg.a aVar2 = flashSalesListActivity.f8997g;
                    if (aVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aVar2 = null;
                    }
                    TextView textView = (TextView) aVar2.f34765g;
                    DiscoverBucket discoverBucket2 = flashSalesListActivity.f9002m;
                    textView.setText(discoverBucket2 != null ? discoverBucket2.getTitle() : null);
                    j jVar = flashSalesListActivity.f9001k;
                    pg.a aVar3 = flashSalesListActivity.f8997g;
                    if (aVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        aVar3 = null;
                    }
                    ImageButton imageButton = (ImageButton) aVar3.f34763e;
                    ImageView imageView = (ImageView) aVar3.f34764f;
                    RecyclerView recyclerView = (RecyclerView) aVar3.f34762d;
                    imageButton.setOnClickListener(new s(flashSalesListActivity, 15));
                    TextView textView2 = (TextView) aVar3.f34765g;
                    DiscoverBucket discoverBucket3 = flashSalesListActivity.f9002m;
                    textView2.setText(discoverBucket3 != null ? discoverBucket3.getTitle() : null);
                    DiscoverBucket discoverBucket4 = flashSalesListActivity.f9002m;
                    String iconUrl2 = discoverBucket4 != null ? discoverBucket4.getIconUrl() : null;
                    if (iconUrl2 != null && iconUrl2.length() != 0) {
                        p30.b.E(imageView, true);
                        DiscoverBucket discoverBucket5 = flashSalesListActivity.f9002m;
                        if (discoverBucket5 != null && (iconUrl = discoverBucket5.getIconUrl()) != null && !r0.v(iconUrl)) {
                            t tVarA = w.a(imageView.getContext());
                            td.e eVar2 = new td.e(imageView.getContext());
                            eVar2.f39959c = iconUrl;
                            k.b(eVar2, imageView);
                            tVarA.a(eVar2.a());
                        }
                    }
                    jVar.f28131e = new z(flashSalesListActivity, 29);
                    jVar.f28132f = new q(flashSalesListActivity, 2);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager() { // from class: com.app.tgtg.feature.flashsales.list.FlashSalesListActivity$setupAdapter$1$layoutManager$1
                        {
                            super(this.f9005a);
                        }

                        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
                        public final RecyclerView.a generateDefaultLayoutParams() {
                            return new RecyclerView.a(-1, -2);
                        }

                        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
                        public final void onLayoutCompleted(n2 n2Var) {
                            n2Var.getClass();
                            super.onLayoutCompleted(n2Var);
                            FlashSalesListActivity flashSalesListActivity2 = this.f9005a;
                            if (flashSalesListActivity2.f9003n && findLastVisibleItemPosition() >= 0 && (findLastVisibleItemPosition() - findFirstVisibleItemPosition()) + 1 > 0) {
                                flashSalesListActivity2.f9003n = false;
                                flashSalesListActivity2.a0();
                            }
                        }
                    };
                    linearLayoutManager.setOrientation(1);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setAdapter(jVar);
                    DiscoverBucket discoverBucket6 = flashSalesListActivity.f9002m;
                    if (discoverBucket6 != null) {
                        jVar.a(discoverBucket6);
                    }
                    recyclerView.k(new b0(flashSalesListActivity, 2));
                    e0 e0Var = flashSalesListActivity.f9000j;
                    if (e0Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impressionHelper");
                        e0Var = null;
                    }
                    e0Var.f30176b.clear();
                    pg.a aVar4 = flashSalesListActivity.f8997g;
                    if (aVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        aVar = aVar4;
                    }
                    y1 layoutManager = ((RecyclerView) aVar.f34762d).getLayoutManager();
                    layoutManager.getClass();
                    if (((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() > -1) {
                        flashSalesListActivity.a0();
                    } else {
                        flashSalesListActivity.f9003n = true;
                    }
                } else {
                    int i14 = FlashSalesListActivity.f8995p;
                }
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                int i15 = FlashSalesListActivity.f8995p;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    w0 w0Var = flashSalesListActivity.f8999i;
                    if (zBooleanValue) {
                        if (w0Var == null) {
                            flashSalesListActivity.f8999i = new w0(flashSalesListActivity);
                        }
                        w0 w0Var2 = flashSalesListActivity.f8999i;
                        if (w0Var2 != null) {
                            pg.a aVar5 = flashSalesListActivity.f8997g;
                            if (aVar5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                aVar = aVar5;
                            }
                            w0Var2.b((ConstraintLayout) aVar.f34761c);
                        }
                    } else if (w0Var != null) {
                        w0Var.a();
                    }
                }
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                int i16 = FlashSalesListActivity.f8995p;
                if (bool2 != null) {
                    if (!bool2.booleanValue()) {
                        Toast.makeText(flashSalesListActivity, flashSalesListActivity.getString(R.string.item_view_error_on_load_store), 0).show();
                    }
                    if (!flashSalesListActivity.isFinishing()) {
                        if (flashSalesListActivity.isTaskRoot()) {
                            new a0().c(flashSalesListActivity);
                        } else {
                            flashSalesListActivity.finish();
                        }
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
