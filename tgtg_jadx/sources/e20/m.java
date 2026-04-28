package e20;

import android.os.Message;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import com.app.tgtg.R;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15685b;

    public /* synthetic */ m(Object obj, int i11) {
        this.f15684a = i11;
        this.f15685b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i11 = this.f15684a;
        boolean z11 = true;
        Message messageObtain = null;
        messageObtain = null;
        Object obj = this.f15685b;
        switch (i11) {
            case 0:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                x xVar = (x) obj;
                p pVar = xVar.f15703e;
                if (pVar != null) {
                    pVar.f15692c = true;
                }
                o.n itemData = navigationMenuItemView.getItemData();
                boolean zQ = xVar.f15701c.q(itemData, xVar, 0);
                if (itemData != null && itemData.isCheckable() && zQ) {
                    xVar.f15703e.b(itemData);
                } else {
                    z11 = false;
                }
                p pVar2 = xVar.f15703e;
                if (pVar2 != null) {
                    pVar2.f15692c = false;
                }
                if (z11) {
                    xVar.b(false);
                }
                break;
            case 1:
                o.n itemData2 = ((h20.h) view).getItemData();
                p10.b bVar = (p10.b) obj;
                boolean zQ2 = bVar.M.f21308a.q(itemData2, bVar.L, 0);
                if (itemData2 != null && itemData2.isCheckable()) {
                    if (!zQ2 || itemData2.isChecked()) {
                        bVar.setCheckedItem(itemData2);
                    }
                    break;
                }
                break;
            case 2:
                k.e eVar = (k.e) obj;
                if (view == eVar.f25541i && (message3 = eVar.f25543k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == eVar.l && (message2 = eVar.f25545n) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == eVar.f25546o && (message = eVar.f25548q) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                eVar.E.obtainMessage(1, eVar.f25534b).sendToTarget();
                break;
            case 3:
                ((ActionMode) obj).a();
                break;
            case 4:
                androidx.appcompat.widget.g gVar = ((Toolbar) obj).M;
                o.n nVar = gVar != null ? gVar.f2155b : null;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                x10.i iVar = (x10.i) obj;
                x10.h hVar = iVar.f43661e;
                x10.h hVar2 = x10.h.YEAR;
                if (hVar == hVar2) {
                    iVar.p(x10.h.DAY);
                    iVar.f43664h.announceForAccessibility(iVar.getString(R.string.mtrl_picker_toggled_to_day_selection));
                } else if (hVar == x10.h.DAY) {
                    iVar.p(hVar2);
                    iVar.f43663g.announceForAccessibility(iVar.getString(R.string.mtrl_picker_toggled_to_year_selection));
                }
                break;
        }
    }
}
