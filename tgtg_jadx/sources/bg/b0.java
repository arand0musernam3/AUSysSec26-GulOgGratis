package bg;

import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import com.app.tgtg.R;
import com.app.tgtg.customview.InputFieldView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputFieldView f6123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f6124c;

    public /* synthetic */ b0(InputFieldView inputFieldView, c0 c0Var, int i11) {
        this.f6122a = i11;
        this.f6123b = inputFieldView;
        this.f6124c = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f6122a;
        c0 c0Var = this.f6124c;
        InputFieldView inputFieldView = this.f6123b;
        Editable editable = (Editable) obj;
        switch (i11) {
            case 0:
                int i12 = InputFieldView.f8908b;
                editable.getClass();
                pg.a aVar = inputFieldView.f8909a;
                ((TextView) aVar.f34765g).setVisibility(8);
                ((TextView) aVar.f34763e).setVisibility(8);
                ((EditText) aVar.f34761c).setBackground(b0.a0.x(inputFieldView.getContext(), R.drawable.input_text_field_background));
                c0Var.h(StringsKt.e0(editable.toString()).toString());
                break;
            default:
                int i13 = InputFieldView.f8908b;
                editable.getClass();
                pg.a aVar2 = inputFieldView.f8909a;
                ((TextView) aVar2.f34765g).setVisibility(8);
                ((TextView) aVar2.f34763e).setVisibility(8);
                ((EditText) aVar2.f34761c).setBackground(b0.a0.x(inputFieldView.getContext(), R.drawable.input_text_field_background));
                c0Var.h(StringsKt.e0(editable.toString()).toString());
                break;
        }
        return Unit.f26487a;
    }
}
