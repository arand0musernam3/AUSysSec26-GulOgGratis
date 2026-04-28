package lq;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.R;
import mv.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends r2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f28125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f28126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, s sVar) {
        super(sVar);
        this.f28126b = jVar;
        this.f28125a = sVar;
        sVar.setOnClickListener(this);
        sVar.setFavoriteOnClickLister(new jt.g(this, 16));
        sVar.setOnCardClicked(new jd.a(this, 18));
    }

    public final void a() {
        j jVar;
        vz.a aVar;
        s sVar = this.f28125a;
        Context context = sVar.getContext();
        context.getClass();
        if (!r0.u(context)) {
            Toast.makeText(sVar.getContext(), sVar.getContext().getString(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later), 0).show();
            return;
        }
        mq.a item = sVar.getItem();
        if (item == null || (aVar = (jVar = this.f28126b).f28131e) == null) {
            return;
        }
        aVar.accept(item, jVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        a();
    }
}
