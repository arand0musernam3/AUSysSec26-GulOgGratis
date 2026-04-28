package gr;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.app.tgtg.R;
import org.jetbrains.annotations.NotNull;
import pg.k3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3 f20807a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        super(context);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i11 = k3.f34962t;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        k3 k3Var = (k3) a8.k.Z(layoutInflaterFrom, R.layout.storage_description_view, this, true, null);
        k3Var.getClass();
        this.f20807a = k3Var;
    }

    @NotNull
    public final k3 getBinding() {
        return this.f20807a;
    }

    public final void setContent(@NotNull pj.c cVar) {
        cVar.getClass();
        TextView textView = this.f20807a.f34963s;
        textView.getClass();
        Context context = getContext();
        context.getClass();
        int i11 = cVar.f35421a;
        int i12 = cVar.f35422b;
        String string = context.getString(cVar.f35423c);
        string.getClass();
        mv.d.z(textView, m0.c.r0(context, i11, i12, string), null, 6);
    }
}
