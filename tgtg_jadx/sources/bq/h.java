package bq;

import android.view.View;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.model.remote.item.response.BasicItem;
import i80.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends r2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f6594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f6595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, k kVar) {
        super(kVar);
        this.f6595b = iVar;
        this.f6594a = kVar;
        kVar.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        mq.a item = this.f6594a.getItem();
        BasicItem basicItem = item instanceof BasicItem ? (BasicItem) item : null;
        if (basicItem == null) {
            return;
        }
        i iVar = this.f6595b;
        ((o) iVar.f6606e).invoke(basicItem, (String) iVar.f6604c, (String) iVar.f6605d, f70.i.SCREEN_STORE);
    }
}
