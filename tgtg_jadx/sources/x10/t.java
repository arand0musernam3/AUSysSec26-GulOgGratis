package x10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.r2;
import com.app.tgtg.R;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f43715a;

    public t(i iVar) {
        this.f43715a = iVar;
    }

    @Override // androidx.recyclerview.widget.l1
    public final int getItemCount() {
        return this.f43715a.f43659c.f43646f;
    }

    @Override // androidx.recyclerview.widget.l1
    public final void onBindViewHolder(r2 r2Var, int i11) {
        s sVar = (s) r2Var;
        i iVar = this.f43715a;
        int i12 = iVar.f43659c.f43641a.f43697c + i11;
        sVar.f43714a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i12)));
        TextView textView = sVar.f43714a;
        Context context = textView.getContext();
        textView.setContentDescription(r.b().get(1) == i12 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i12)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i12)));
        ub.a aVar = iVar.f43662f;
        if (r.b().get(1) == i12) {
            Object obj = aVar.f40982c;
        } else {
            Object obj2 = aVar.f40981b;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.l1
    public final r2 onCreateViewHolder(ViewGroup viewGroup, int i11) {
        return new s((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
