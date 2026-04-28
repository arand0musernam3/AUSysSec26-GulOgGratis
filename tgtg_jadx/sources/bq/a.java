package bq;

import a3.y0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import c50.w;
import c6.y;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.StoreInformation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6576c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mc.a f6577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.store_view_address, (ViewGroup) this, false);
        addView(viewInflate);
        int i11 = R.id.directionsBtn;
        ConstraintLayout constraintLayout = (ConstraintLayout) pd.g.t(R.id.directionsBtn, viewInflate);
        if (constraintLayout != null) {
            i11 = R.id.ivAddress;
            if (((ImageView) pd.g.t(R.id.ivAddress, viewInflate)) != null) {
                i11 = R.id.tvAddress;
                TextView textView = (TextView) pd.g.t(R.id.tvAddress, viewInflate);
                if (textView != null) {
                    i11 = R.id.tvClick;
                    if (((TextView) pd.g.t(R.id.tvClick, viewInflate)) != null) {
                        i11 = R.id.view;
                        if (pd.g.t(R.id.view, viewInflate) != null) {
                            this.f6577b = new mc.a((RelativeLayout) viewInflate, constraintLayout, textView);
                            setLayoutParams(new RecyclerView.a(-1, -2));
                            return;
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        throw null;
    }

    @Override // bq.g
    public final void a(StoreInformation storeInformation, y yVar, zp.b bVar) {
        storeInformation.getClass();
        yVar.getClass();
        bVar.getClass();
        setStore(storeInformation);
        mc.a aVar = this.f6577b;
        ((TextView) aVar.f29924d).setText(storeInformation.getStoreLocation().getAddress().getStreetAddress());
        mv.d.x((ConstraintLayout) aVar.f29922b, new y0(this, storeInformation, yVar, 2));
    }
}
