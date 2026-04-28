package lq;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.R;
import mv.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends r2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f28133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f28134b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, m mVar) {
        super(mVar);
        this.f28134b = lVar;
        this.f28133a = mVar;
        mVar.setOnClickListener(this);
        mVar.setFavoriteOnClickLister(new jt.g(this, 17));
        mVar.setOnCardClicked(new jd.a(this, 19));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        m mVar = this.f28133a;
        Context context = mVar.getContext();
        context.getClass();
        if (!r0.u(context)) {
            Toast.makeText(mVar.getContext(), mVar.getContext().getString(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later), 0).show();
            return;
        }
        Consumer consumer = this.f28134b.f28139d;
        if (consumer != null) {
            if ((mVar instanceof bq.k) || (mVar instanceof p) || (mVar instanceof s)) {
                consumer.accept(mVar);
            }
        }
    }
}
