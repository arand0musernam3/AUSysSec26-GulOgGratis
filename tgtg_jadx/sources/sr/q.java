package sr;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.app.tgtg.R;
import java.util.Arrays;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f39112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f39113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f39114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PopupWindow f39115d;

    public q(Activity activity) {
        this.f39112a = activity;
    }

    public final void a(f fVar) {
        fVar.getClass();
        Activity activity = this.f39112a;
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.msg_sent_confirm_email, (ViewGroup) null, false);
        PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -1, false);
        this.f39115d = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        View viewFindViewById = viewInflate.findViewById(R.id.title);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.description);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.description2);
        viewFindViewById3.getClass();
        TextView textView3 = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.description3);
        viewFindViewById4.getClass();
        TextView textView4 = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.btnPositive);
        viewFindViewById5.getClass();
        Button button = (Button) viewFindViewById5;
        switch (p.$EnumSwitchMapping$0[fVar.ordinal()]) {
            case 1:
                textView.setText(R.string.contact_us_email_confirmed_title);
                textView2.setText(R.string.contact_us_email_confirmed_description);
                button.setText(R.string.contact_us_thanks_for_input_positive_btn);
                break;
            case 2:
                textView.setText(R.string.auto_refund_confirmation_title);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = activity.getString(R.string.auto_refund_confirmation_description_res_lifted_part_1);
                string.getClass();
                textView2.setText(String.format(string, Arrays.copyOf(new Object[]{String.valueOf(this.f39114c)}, 1)));
                textView3.setText(R.string.auto_refund_confirmation_description_part_2);
                textView3.setVisibility(0);
                button.setText(R.string.auto_refund_confirmation_button);
                break;
            case 3:
                textView.setText(R.string.auto_refund_confirmation_title);
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String string2 = activity.getString(R.string.auto_refund_confirmation_description_money_returned_part_1);
                string2.getClass();
                textView2.setText(String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(this.f39114c)}, 1)));
                textView3.setText(R.string.auto_refund_confirmation_description_part_2);
                textView3.setVisibility(0);
                button.setText(R.string.auto_refund_confirmation_button);
                break;
            case 4:
                textView.setText(R.string.auto_refund_confirmation_title);
                textView2.setText(R.string.auto_refund_confirmation_description_voucher_reinstated_part_1);
                textView3.setText(R.string.auto_refund_confirmation_description_part_2);
                textView3.setVisibility(0);
                button.setText(R.string.auto_refund_confirmation_button);
                break;
            case 5:
                textView.setText(R.string.contact_us_cancelled_order_title);
                textView2.setText(R.string.contact_us_cancelled_order_message_part_1);
                textView3.setText(R.string.contact_us_cancelled_order_message_part_2);
                textView3.setVisibility(0);
                textView4.setText(R.string.contact_us_cancelled_order_message_part_3);
                textView4.setVisibility(0);
                button.setText(R.string.auto_refund_confirmation_button);
                break;
            case 6:
                textView.setText(R.string.auto_refund_confirmation_title);
                textView2.setText(R.string.order_status_cancel_refund_waiting);
                button.setText(R.string.auto_refund_confirmation_button);
                break;
            default:
                textView.setText(R.string.contact_us_thanks_for_input_title);
                textView2.setText(R.string.contact_us_thanks_for_input_description);
                button.setText(R.string.auto_refund_confirmation_button);
                break;
        }
        mv.d.x(button, new sg.c(this, 2));
        PopupWindow popupWindow2 = this.f39115d;
        if (popupWindow2 != null) {
            popupWindow2.setAnimationStyle(R.style.ContactUsPopupAnimationRightToLeft);
        }
        PopupWindow popupWindow3 = this.f39115d;
        if (popupWindow3 != null) {
            popupWindow3.showAtLocation(activity.findViewById(android.R.id.content), 17, 0, 0);
        }
    }
}
