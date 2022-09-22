CREATE INDEX ON medical_histories (patient_id);
CREATE INDEX ON treatments_history (medical_histories_id);
CREATE INDEX ON treatments_history (treatment_id);
CREATE INDEX ON invoices (medical_history_id);
CREATE INDEX ON invoice_items (invoice_id);
CREATE INDEX ON invoice_items (treatment_id);