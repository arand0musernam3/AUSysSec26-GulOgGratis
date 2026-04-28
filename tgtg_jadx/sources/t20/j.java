package t20;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ChipTextInputComboView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f39697b;

    public /* synthetic */ j(ViewGroup viewGroup, int i11) {
        this.f39696a = i11;
        this.f39697b = viewGroup;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i11 = this.f39696a;
        ViewGroup viewGroup = this.f39697b;
        switch (i11) {
            case 0:
                ((l) viewGroup).a().a();
                break;
            default:
                boolean zIsEmpty = TextUtils.isEmpty(editable);
                ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) viewGroup;
                Chip chip = chipTextInputComboView.f12690a;
                if (!zIsEmpty) {
                    int i12 = ChipTextInputComboView.f12689e;
                    String strA = chipTextInputComboView.a(editable);
                    if (TextUtils.isEmpty(strA)) {
                        strA = chipTextInputComboView.a("00");
                    }
                    chip.setText(strA);
                } else {
                    chip.setText(chipTextInputComboView.a("00"));
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        switch (this.f39696a) {
            case 0:
                ((l) this.f39697b).a().b();
                break;
        }
    }

    public final void a(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}
