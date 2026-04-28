package com.adyen.checkout.ui.core.internal.util;

import com.adyen.checkout.components.core.internal.ui.model.FieldState;
import com.adyen.checkout.components.core.internal.ui.model.Validation;
import com.adyen.checkout.ui.core.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/util/SocialSecurityNumberUtils;", "", "()V", "CNPJ_DIGIT_LIMIT", "", "CNPJ_MASK_GROUPING", "", "CNPJ_MASK_SEPARATORS", "", "getCNPJ_MASK_SEPARATORS", "()Ljava/util/List;", "CNPJ_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "CNPJ_REGEX", "", "CPF_DIGIT_LIMIT", "CPF_MASK_GROUPING", "CPF_MASK_SEPARATORS", "CPF_PATTERN", "CPF_REGEX", "formatInput", "inputString", "validateSocialSecurityNumber", "Lcom/adyen/checkout/components/core/internal/ui/model/FieldState;", "socialSecurityNumber", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSocialSecurityNumberUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialSecurityNumberUtils.kt\ncom/adyen/checkout/ui/core/internal/util/SocialSecurityNumberUtils\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n434#2:75\n507#2,5:76\n434#2:81\n507#2,5:82\n434#2:87\n507#2,5:88\n1872#3,3:93\n*S KotlinDebug\n*F\n+ 1 SocialSecurityNumberUtils.kt\ncom/adyen/checkout/ui/core/internal/util/SocialSecurityNumberUtils\n*L\n34#1:75\n34#1:76,5\n40#1:81\n40#1:82,5\n44#1:87\n44#1:88,5\n64#1:93,3\n*E\n"})
public final class SocialSecurityNumberUtils {
    public static final int CNPJ_DIGIT_LIMIT = 14;
    private static final int CPF_DIGIT_LIMIT = 11;

    @NotNull
    public static final SocialSecurityNumberUtils INSTANCE = new SocialSecurityNumberUtils();

    @NotNull
    private static final String CPF_REGEX = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
    private static final Pattern CPF_PATTERN = Pattern.compile(CPF_REGEX);

    @NotNull
    private static final List<Integer> CPF_MASK_GROUPING = d0.h(3, 3, 3, 2);

    @NotNull
    private static final List<Character> CPF_MASK_SEPARATORS = d0.h('.', '.', '-');

    @NotNull
    private static final String CNPJ_REGEX = "\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}";
    private static final Pattern CNPJ_PATTERN = Pattern.compile(CNPJ_REGEX);

    @NotNull
    private static final List<Integer> CNPJ_MASK_GROUPING = d0.h(2, 3, 3, 4, 2);

    @NotNull
    private static final List<Character> CNPJ_MASK_SEPARATORS = d0.h('.', '.', '/', '-');

    private SocialSecurityNumberUtils() {
    }

    @NotNull
    public final String formatInput(@NotNull String inputString) throws IOException {
        inputString.getClass();
        StringBuilder sb2 = new StringBuilder();
        int length = inputString.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = inputString.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb3 = new StringBuilder();
        Pair pair = string.length() <= 11 ? new Pair(CPF_MASK_GROUPING, CPF_MASK_SEPARATORS) : new Pair(CNPJ_MASK_GROUPING, CNPJ_MASK_SEPARATORS);
        List list = (List) pair.f26485a;
        List list2 = (List) pair.f26486b;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                break;
            }
            if (string.length() < ((Number) list.get(i13)).intValue()) {
                if (string.length() > 0) {
                    arrayList.add(string);
                    break;
                }
            } else {
                arrayList.add(b0.x(((Number) list.get(i13)).intValue(), string));
                string = string.substring(((Number) list.get(i13)).intValue());
            }
            i13++;
        }
        for (Object obj : arrayList) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                d0.n();
                throw null;
            }
            sb3.append((String) obj);
            if (i11 != arrayList.size() - 1) {
                sb3.append(((Character) list2.get(i11)).charValue());
            }
            i11 = i14;
        }
        return sb3.toString();
    }

    @NotNull
    public final List<Character> getCNPJ_MASK_SEPARATORS() {
        return CNPJ_MASK_SEPARATORS;
    }

    @NotNull
    public final FieldState<String> validateSocialSecurityNumber(@NotNull String socialSecurityNumber) throws IOException {
        socialSecurityNumber.getClass();
        StringBuilder sb2 = new StringBuilder();
        int length = socialSecurityNumber.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = socialSecurityNumber.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        int length2 = sb2.toString().length();
        Validation invalid = (length2 == 11 && CPF_PATTERN.matcher(socialSecurityNumber).matches()) ? Validation.Valid.INSTANCE : (length2 == 14 && CNPJ_PATTERN.matcher(socialSecurityNumber).matches()) ? Validation.Valid.INSTANCE : new Validation.Invalid(R.string.checkout_social_security_number_not_valid, false, 2, null);
        StringBuilder sb3 = new StringBuilder();
        int length3 = socialSecurityNumber.length();
        for (int i12 = 0; i12 < length3; i12++) {
            char cCharAt2 = socialSecurityNumber.charAt(i12);
            if (Character.isDigit(cCharAt2)) {
                sb3.append(cCharAt2);
            }
        }
        return new FieldState<>(sb3.toString(), invalid);
    }
}
