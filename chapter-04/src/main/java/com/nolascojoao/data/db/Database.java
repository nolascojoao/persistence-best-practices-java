package com.nolascojoao.data.db;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public enum Database {

	INSTANCE;

	// Emulates a database table structure where the main keys are IDs and
	// the values represent the associated data
	private Map<String, Map<String, Object>> db = new HashMap<>();

	public Optional<Map<String, Object>> findById(String id) {
		Objects.requireNonNull(id, "id is required");
		return Optional.ofNullable(db.get(id));
	}

	public Map<String, Object> insert(String id, Map<String, Object> entry) {
		Objects.requireNonNull(id, "id is required");
		Objects.requireNonNull(entry, "entry is required");
		db.put(id, entry);
		return entry;
	}

	public void delete(String id) {
		Objects.requireNonNull(id, "id is required");
		db.remove(id);
	}

	public Map<String, Object> update(String id, Map<String, Object> entry) {
		Objects.requireNonNull(id, "id is required");
		Objects.requireNonNull(entry, "entry is required");
		if (findById(id).isEmpty()) {
			throw new IllegalArgumentException("The database cannot be updated");
		}
		db.put(id, entry);
		return entry;
	}

}
