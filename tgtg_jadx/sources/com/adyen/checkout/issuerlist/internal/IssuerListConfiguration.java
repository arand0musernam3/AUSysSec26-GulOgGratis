package com.adyen.checkout.issuerlist.internal;

import android.content.Context;
import com.adyen.checkout.action.core.GenericActionConfiguration;
import com.adyen.checkout.action.core.internal.ActionHandlingPaymentMethodConfigurationBuilder;
import com.adyen.checkout.components.core.internal.ButtonConfiguration;
import com.adyen.checkout.components.core.internal.ButtonConfigurationBuilder;
import com.adyen.checkout.components.core.internal.Configuration;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.issuerlist.IssuerListViewType;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration;", "Lcom/adyen/checkout/components/core/internal/Configuration;", "Lcom/adyen/checkout/components/core/internal/ButtonConfiguration;", "()V", "genericActionConfiguration", "Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "getGenericActionConfiguration", "()Lcom/adyen/checkout/action/core/GenericActionConfiguration;", "hideIssuerLogos", "", "getHideIssuerLogos", "()Ljava/lang/Boolean;", "viewType", "Lcom/adyen/checkout/issuerlist/IssuerListViewType;", "getViewType", "()Lcom/adyen/checkout/issuerlist/IssuerListViewType;", "IssuerListBuilder", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class IssuerListConfiguration implements Configuration, ButtonConfiguration {
    @NotNull
    public abstract GenericActionConfiguration getGenericActionConfiguration();

    @Nullable
    public abstract Boolean getHideIssuerLogos();

    @Nullable
    public abstract IssuerListViewType getViewType();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00002\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u00020\u0005B\u0017\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001f\b\u0015\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rB\u001f\b\u0014\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\"J\u0015\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\"J\u0015\u0010 \u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010#R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0097\u000e¢\u0006\u0016\n\u0002\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration$IssuerListBuilder;", "IssuerListConfigurationT", "Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration;", "IssuerListBuilderT", "Lcom/adyen/checkout/action/core/internal/ActionHandlingPaymentMethodConfigurationBuilder;", "Lcom/adyen/checkout/components/core/internal/ButtonConfigurationBuilder;", "environment", "Lcom/adyen/checkout/core/Environment;", "clientKey", "", "(Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "shopperLocale", "Ljava/util/Locale;", "(Ljava/util/Locale;Lcom/adyen/checkout/core/Environment;Ljava/lang/String;)V", "hideIssuerLogos", "", "getHideIssuerLogos", "()Ljava/lang/Boolean;", "setHideIssuerLogos", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isSubmitButtonVisible", "isSubmitButtonVisible$annotations", "()V", "setSubmitButtonVisible", "viewType", "Lcom/adyen/checkout/issuerlist/IssuerListViewType;", "getViewType", "()Lcom/adyen/checkout/issuerlist/IssuerListViewType;", "setViewType", "(Lcom/adyen/checkout/issuerlist/IssuerListViewType;)V", "(Z)Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration$IssuerListBuilder;", "(Lcom/adyen/checkout/issuerlist/IssuerListViewType;)Lcom/adyen/checkout/issuerlist/internal/IssuerListConfiguration$IssuerListBuilder;", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class IssuerListBuilder<IssuerListConfigurationT extends IssuerListConfiguration, IssuerListBuilderT extends IssuerListBuilder<IssuerListConfigurationT, IssuerListBuilderT>> extends ActionHandlingPaymentMethodConfigurationBuilder<IssuerListConfigurationT, IssuerListBuilderT> implements ButtonConfigurationBuilder {

        @Nullable
        private Boolean hideIssuerLogos;

        @Nullable
        private Boolean isSubmitButtonVisible;

        @Nullable
        private IssuerListViewType viewType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @d
        public IssuerListBuilder(@NotNull Context context, @NotNull Environment environment, @NotNull String str) {
            super(context, environment, str);
            context.getClass();
            environment.getClass();
            str.getClass();
        }

        @Nullable
        public Boolean getHideIssuerLogos() {
            return this.hideIssuerLogos;
        }

        @Nullable
        public IssuerListViewType getViewType() {
            return this.viewType;
        }

        @Nullable
        /* JADX INFO: renamed from: isSubmitButtonVisible, reason: from getter */
        public Boolean getIsSubmitButtonVisible() {
            return this.isSubmitButtonVisible;
        }

        @d
        @NotNull
        public IssuerListBuilderT setHideIssuerLogos(boolean hideIssuerLogos) {
            setHideIssuerLogos(Boolean.valueOf(hideIssuerLogos));
            return this;
        }

        @Override // com.adyen.checkout.components.core.internal.ButtonConfigurationBuilder
        @d
        @NotNull
        public IssuerListBuilderT setSubmitButtonVisible(boolean isSubmitButtonVisible) {
            setSubmitButtonVisible(Boolean.valueOf(isSubmitButtonVisible));
            return this;
        }

        @d
        @NotNull
        public IssuerListBuilderT setViewType(@NotNull IssuerListViewType viewType) {
            viewType.getClass();
            m103setViewType(viewType);
            return this;
        }

        /* JADX INFO: renamed from: setViewType, reason: collision with other method in class */
        public void m103setViewType(@Nullable IssuerListViewType issuerListViewType) {
            this.viewType = issuerListViewType;
        }

        public void setHideIssuerLogos(@Nullable Boolean bool) {
            this.hideIssuerLogos = bool;
        }

        public void setSubmitButtonVisible(@Nullable Boolean bool) {
            this.isSubmitButtonVisible = bool;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IssuerListBuilder(@NotNull Environment environment, @NotNull String str) {
            super(environment, str);
            environment.getClass();
            str.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IssuerListBuilder(@NotNull Locale locale, @NotNull Environment environment, @NotNull String str) {
            super(locale, environment, str);
            locale.getClass();
            environment.getClass();
            str.getClass();
        }

        @d
        public static /* synthetic */ void isSubmitButtonVisible$annotations() {
        }
    }
}
